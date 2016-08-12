app.controller('myCtrl',function($scope,$http){
		
	var url='http://localhost:8083/Employee_Angular/ListAllEmployee';
	
	$http.get(url)
		.success(function(response){
			$scope.employees=response;
		});
	
	});


