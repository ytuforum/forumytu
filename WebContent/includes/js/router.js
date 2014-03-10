var indexApp = angular.module('indexApp',[]);

indexApp.controller('indexCtrl',function($scope,$http){
	
	$scope.data=[];
	
    $scope.getVariables = function(data,status){
    	$scope.data = data[0];
    	$scope.script = data[0].script;
    };
    $scope.fetch = function(){
    	$http.get("deneme").success($scope.getVariables);
    };
    $scope.fetch();
});