/**=========================================================
 * Module: demo-dialog.js
 * Demo for multiple ngDialog Usage
 * - ngDialogProvider for default values not supported 
 *   using lazy loader. Include plugin in base.js instead.
 =========================================================*/

(function() {
    'use strict';

    angular
        .module('app.products')
        .controller('ProductsCtrl', ProductsCtrl)
        .controller('ProductsMainCtrl', ProductsMainCtrl);

    ProductsCtrl.$inject = ['$scope', 'ngDialog', 'tpl'];
    // Called from the route state. 'tpl' is resolved before
    function ProductsCtrl($scope, ngDialog, tpl) {
        
        activate();

        ////////////////

        function activate() {          
          $scope.tpl = tpl;                
        }
    }  
    
    ProductsMainCtrl.$inject = ['$scope', 'ngDialog'];
    function ProductsMainCtrl($scope, ngDialog) {
    	activate();

        ////////////////

        function activate() {
        	// open dialog window
            $scope.productModal = function(){
          	  ngDialog.open({
                    template: $scope.tpl.path,
                    className: 'ngdialog-theme-default dialogwidth'
                  });
            };  
        }    	 
    }
})();



