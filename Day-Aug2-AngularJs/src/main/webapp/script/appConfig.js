var app=angular.module('myApp',['ngRoute']);

app.config(function($routeProvider){
	$routeProvider
		.when('/',{
			template : '<h1>Welcome To Film Management System</h1>'
			
		})
		.when('/create',{
			//template : '<h1> Create Page</h1>'
			templateUrl : 'createFilm.html',
			controller : 'filmCreateCtrl'
		})
		.when('/update',{
			//template : '<h1> Update Page</h1>',
			templateUrl : 'updateFilm.html',
				controller : 'filmUpdateCtrl'
		})
		.when('/delete',{
			//template : '<h1> Delete Page</h1>'
			templateUrl : 'DeleteFilm.html',
			controller : 'filmDeleteCtrl'
			
			
		})
		.when('/listall',{
			//template : '<h1> Delete Page</h1>'
			templateUrl : 'DeleteFilm.html',
			controller : 'listAllFilmCtrl'
			
		})
		.when('/search',{
			template : '<h1> Search Page</h1>'
		})
		.when('/logout',{
			template : '<h1> Logout Page</h1>'
		})
	
});


app.controller('filmCreateCtrl',function($scope){
	$scope.heading='Film Details';
});


app.controller('filmUpdateCtrl',function($scope){
	$scope.heading='Film Details';
});

app.controller('filmDeleteCtrl',function($scope){
	$scope.heading='Film Details';
});
app.controller('listAllFilmCtrl',function($scope){
	$scope.heading='Film Details';
});
