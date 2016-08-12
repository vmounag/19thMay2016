app.factory('printgreetings', function(){
	return "goodMorning!";
});
app.factory('funconcatenation', function(){
	
	var con={};
	con.concat=function(firstname,lastname){
		return firstname+lastname;
	}

	return con;
});


app.controller('concatenation',function($scope,funconcatenation){
	
		$scope.firstname=firstname;
		$scope.lastname=lastname;
		$scope.concat=function(){
			alert(concatenation.con($scope.firstname,$scope.lastname));
		}
	});






app.controller('myCtrl',function($scope,count,printgreetings){
	console.log('countvalue;'+count);
		$scope.greet=printgreetings;
		$scope.userName=username;
		
	});


