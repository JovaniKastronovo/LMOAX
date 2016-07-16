(function() {
    'use strict';

    angular
        .module('app.products')
        .factory('ProductService', ProductService);

    ProductService.$inject = ['$http', '$q'];
    function ProductService($http, $q) {
        var service = {
            nextProductId: nextProductId,
            saveProduct: saveProduct,
            getCategories: getCategories,
            getDeptos: getDeptos
        };
        return service;
        
        function nextProductId() {        	
        	return $http.get("product/newId.html")
        			.then(function(response){
        				return response.data;
        			}, function(errorResp){
        				 console.error('Error while fetching the next product Id'+errorResp);
                         return $q.reject(errorResp);
        			});
        }
        
        function getCategories(){
        	return $http.get("product/categories.json")
					.then(function(response){
						return response.data;
					}, function(errorResp){
						 console.error('Error while fetching the categories '+errorResp);
		                 return $q.reject(errorResp);
					});
        }
 
        function getDeptos(){
        	return $http.get("product/deptos.json")
					.then(function(response){
						return response.data;
					}, function(errorResp){
						 console.error('Error while fetching the departaments '+errorResp);
		                 return $q.reject(errorResp);
					});
        }
        
        function saveProduct() {
        	return null;
        }
    }
})();
