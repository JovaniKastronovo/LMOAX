(function() {
    'use strict';

    angular
        .module('app.core', [
            'ngRoute',
            'ngStorage',
            'ui.router',
            'oc.lazyLoad',
            'cfp.loadingBar',
            'ngSanitize',
            'pascalprecht.translate',
            'ui.bootstrap',
            'tmh.dynamicLocale',
            'ngCookies'
        ]);
})();