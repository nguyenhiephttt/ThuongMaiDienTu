(function(module){
    module.controller('ListProductController', function($scope,$http, $stateParams){
        var baseUrl = 'http://localhost:8080/api/';

        this.$onInit=function(){
            getdataProducts();
            console.log('init');
            
           
            
        }
        $scope.eror=true;
        getdataProducts = function () {
			$http({
				method: "GET",
				url: baseUrl + 'categories/'+$stateParams.id+'/products'
			}).then(function mySuccess(response) {
				$scope.productsByCategory = response.data;
                $scope.error=false;
                console.log($scope.productsByCategory);
                
				//$scope.images = $scope.singleProducts.images;
				//scope.defaultImage = $scope.images[0];
			});
		}

    });
}(angular.module('myApp')));