var indexControllers = angular.module('indexControllers', []);
 
indexControllers.controller('anasayfaCtrl', ['$scope', '$http',
	function($scope,$http){
    	$http.get('anasayfa').success(function(data) {
    		$scope.data = data[0];
		});
	}
]);
 