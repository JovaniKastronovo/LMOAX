(function() {
    'use strict';

    angular
        .module('app.core', [
            'ngRoute',
            'ngStorage',
            'ui.router',
            'oc.lazyLoad',
            'pascalprecht.translate',
            'tmh.dynamicLocale',
            'ngCookies'
        ]);
})();