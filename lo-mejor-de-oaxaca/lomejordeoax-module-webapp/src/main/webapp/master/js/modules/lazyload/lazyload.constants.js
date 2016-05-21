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
          modules: [
                    {name: 'datatables',                files: ['vendor/datatables/media/css/jquery.dataTables.css',
                                                                'vendor/datatables/media/js/jquery.dataTables.js',
                                                                'vendor/angular-datatables/dist/angular-datatables.js'], serie: true},
                    {name: 'ngDialog',                  files: ['vendor/ng-dialog/js/ngDialog.min.js',
                                                                'vendor/ng-dialog/css/ngDialog.min.css',
                                                                'vendor/ng-dialog/css/ngDialog-theme-default.min.css'] }]
        });

})();
