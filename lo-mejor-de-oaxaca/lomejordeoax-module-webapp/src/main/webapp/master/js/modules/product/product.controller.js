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
        .controller('ProductsMainCtrl', ProductsMainCtrl)
        .controller('ProductsModalCtrl', ProductsModalCtrl);
    
    ProductsCtrl.$inject = ['$scope', 'tpl'];
    // Called from the route state. 'tpl' is resolved before
    function ProductsCtrl($scope, tpl) {
        
        activate();

        function activate() {          
          $scope.tpl = tpl;                
        }
    }  
    
    ProductsMainCtrl.$inject = ['$scope', 'ngDialog'];
    function ProductsMainCtrl($scope, ngDialog) {
    	
    	activate();
    	
        function activate() {
        	// open dialog window
            $scope.productModal = function(){
          	  ngDialog.open({
                    template: $scope.tpl.path +  '?v=' + (new Date().getTime()),
                    className: 'ngdialog-theme-default dialogwidth',
                    controller: 'ProductsModalCtrl',
                    controllerAs: 'prod'
                  });
            };  
        }    	 
    }
    
    ProductsModalCtrl.$inject = ['$scope', 'ProductService'];
    function ProductsModalCtrl($scope, ProductService) {
    	var vm = this;
    	
    	activate();

        function activate() {
        	vm.productId;
        	vm.categories = new Array();
        	vm.deptos = new Array();
        	//Categorie's Catalogs
        	ProductService.getCategories().then(function(resp){
        		vm.categories = resp;
        	},function(){new Array();});
        	
//        	//Departament's Catalogs
//        	ProductService.getDeptos().then(function(resp){
//        		vm.deptos = resp;
//        	},function(){new Array();});
//        	
        	vm.nextId = function(){
        		ProductService.nextProductId().then(function(resp){
        			vm.productId = resp;
        		}, function(){
        			
        		});
        	};
        }    	 
    }
})();



