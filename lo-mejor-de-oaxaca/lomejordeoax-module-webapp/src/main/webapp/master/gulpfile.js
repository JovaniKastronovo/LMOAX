var gulp = require('gulp'),
	$ = require('gulp-load-plugins')(),
	gulpsync = $.sync(gulp);

//production mode (see build task)
var isProduction = false;

//MAIN PATHS
var paths = {
    app: '../app/',
    scripts: 'js/'
};

//VENDOR CONFIG
var vendor = {
    // vendor scripts required to start the app
    base: {
        source: require('./vendor.base.json'),
        js: 'base.js',
        css: 'base.css'
    },
    // vendor scripts to make the app work. Usually via lazy loading
    app: {
        source: require('./vendor.json'),
        dest: '../vendor'
    }
};

//SOURCES CONFIG
var source = {
    scripts: [paths.scripts + 'app.module.js',
        // template modules
        paths.scripts + 'modules/**/*.module.js',
        paths.scripts + 'modules/**/*.js',
        // custom modules
        paths.scripts + 'custom/**/*.module.js',
        paths.scripts + 'custom/**/*.js'
    ]
};

//BUILD TARGET CONFIG
var build = {
    scripts: paths.app + 'js',
    styles: paths.app + 'css'
};

var vendorUglifyOpts = {
	    mangle: {
	        except: ['$super'] // rickshaw requires this
	    }
};

var cssnanoOpts = {
	    safe: true,
	    discardUnused: false, // no remove @font-face
	    reduceIdents: false // no change on @keyframes names
};

//---------------
//TASKS
//---------------


//JS APP
gulp.task('scripts:app', function() {
 log('Building scripts..');
 // Minify and copy all JavaScript (except vendor scripts)
 return gulp.src(source.scripts)
     .pipe($.jsvalidate())
     .on('error', handleError)
     .pipe($.concat('app.js'))
     .pipe($.ngAnnotate())
     .on('error', handleError)
     .pipe($.if(isProduction, $.uglify({
         preserveComments: 'some'
     })))
     .on('error', handleError)
     .pipe(gulp.dest(build.scripts));
});

//VENDOR BUILD
gulp.task('vendor', gulpsync.sync(['vendor:base', 'vendor:app']));

// Build the base script to start the application from vendor assets
gulp.task('vendor:base', function() {
    log('Copying base vendor assets..');

    var jsFilter = $.filter('**/*.js', {
        restore: true
    });
    var cssFilter = $.filter('**/*.css', {
        restore: true
    });

    return gulp.src(vendor.base.source)
        .pipe($.expectFile(vendor.base.source))
        .pipe(jsFilter)
            .pipe($.concat(vendor.base.js))
            .pipe($.if(isProduction, $.uglify()))
            .pipe(gulp.dest(build.scripts))
        .pipe(jsFilter.restore)
        .pipe(cssFilter)
            .pipe($.concat(vendor.base.css))
            .pipe($.if(isProduction, $.cssnano(cssnanoOpts)))
            .pipe(gulp.dest(build.styles))
        .pipe(cssFilter.restore)
        ;
});

// copy file from bower folder into the app vendor folder
gulp.task('vendor:app', function() {
    log('Copying vendor assets..');

    var jsFilter = $.filter('**/*.js', {
        restore: true
    });
    var cssFilter = $.filter('**/*.css', {
        restore: true
    });

    return gulp.src(vendor.app.source, {
            base: 'bower_components'
        })
        .pipe($.expectFile(vendor.app.source))
        .pipe(jsFilter)
        .pipe($.if(isProduction, $.uglify(vendorUglifyOpts)))
        .pipe(jsFilter.restore)
        .pipe(cssFilter)
        .pipe($.if(isProduction, $.cssnano(cssnanoOpts)))
        .pipe(cssFilter.restore)
        .pipe(gulp.dest(vendor.app.dest));

});

//Error handler
function handleError(err) {
    log(err.toString());
    this.emit('end');
};

// log to console using
function log(msg) {
    $.util.log($.util.colors.blue(msg));
};