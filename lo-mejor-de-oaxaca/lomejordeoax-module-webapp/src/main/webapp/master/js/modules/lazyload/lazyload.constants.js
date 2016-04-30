(function() {
    'use strict';

    angular
        .module('app.lazyload')
        .constant('APP_REQUIRES', {
          // jQuery based and standalone scripts
          scripts: {
        	  'modernizr':          ['vendor/modernizr/modernizr.custom.js'],
        	  'icons':              ['vendor/fontawesome/css/font-awesome.min.css',
                                   'vendor/simple-line-icons/css/simple-line-icons.css'],
              'screenfull':         ['vendor/screenfull/dist/screenfull.js']
          },
          // Angular based script (use the right module name)
          modules: []
        })
        ;

})();
