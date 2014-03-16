var indexApp = angular.module('indexApp', [
    'ngRoute',
    'indexControllers'
]);
 
indexApp.config(['$routeProvider',
function($routeProvider) {
    $routeProvider.
        when('/anasayfa', {
        templateUrl: 'views/index/index.html',
        controller: 'anasayfaCtrl'
    }).
    otherwise({
        redirectTo: '/anasayfa'
    });
}]);