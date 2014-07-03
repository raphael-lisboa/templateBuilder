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

    
	$scope.getItens = function (templateId, callback) {
		console.log('chegou'+templateId);  
            return $http({
                url: 'find/'+templateId+'.json',
                method: 'GET'
            }).success(function(data){

            	$scope.itens=data.itens;
				console.log(data.itens);
               });
        };
   
}]);




</script>

</head>
<body ng-controller="ListTemplates">
	<h2>Templates list</h2>
	

	
		<label> templates</label>
		 <select name="selTemplate" data-ng-model="templateModel" ng-change="getItens(templateModel)" >
		 	 <option value="">-- Select --</option>
		 	 	 <option ng-repeat="template in templates "  value="{{template.id}}" >{{template.name}}</option>
		 	</select>
				
	<div ng-show="itens != null">
<form name="templateForm" action="save" method="post" modelAttribute="itens">
	<fieldset>
	
	<legend>Configurações</legend>
	
		<ul>
			<li ng-repeat="item in itens">
				<label>{{item.name}}</label> <input name="templateItem" />
			</li>
		</ul>
		</fieldset>
			<input type="submit" value="Salvar">
	</div>

	</form>
</body>


</html>

