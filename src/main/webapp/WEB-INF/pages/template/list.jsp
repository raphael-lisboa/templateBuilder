<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html ng-app="myApp">
<head>
<script type="text/javascript" 	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
<script type="text/javascript" 	>

var myApp = angular.module("myApp",[]);

myApp.controller("ListTemplates",['$scope', '$http',function($scope, $http) {
    
	$http.get('listJson.json').
        success(function(data) {
        	$scope.templates = data;        
        	console.log(data);
    });
}]);


</script>

</head>
<body ng-controller="ListTemplates">
	<h2>Templates list</h2>
	<form name="templateForm">
		<label> templates</label>
		 <select name="selTemplate" >
		 	 <option value="">-- Select --</option>
		 	 	 <option ng-repeat="template in templates "  value="{{template.name}}">{{template.name}}</option>
		 	</select>
				
	

	</form>
</body>


</html>

