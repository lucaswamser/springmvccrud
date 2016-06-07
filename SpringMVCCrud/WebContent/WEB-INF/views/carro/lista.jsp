<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<style>
th {
    cursor:pointer;
}
</style>
<div ng-app="myApp" ng-controller="crud">

<div class="row">
<div class="col-md-6">
<div class="btn-group">
  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    <i class="fa fa-bars" aria-hidden="true"></i> Ações <span class="caret"></span>
  </button>
  <ul class="dropdown-menu">
    <li><a href="add"><span class="glyphicon glyphicon-plus"></span> Adicionar</a></li>
    <li><a href="add"><span class="glyphicon glyphicon-search"></span> Buscar</a></li>
    
  </ul>
</div>
</div>
<div class="col-md-6">
<input type="text" ng-model="search" class="form-control" placeholder="Search">
</div>
</div>
	<br><br>
    <table class="table table-hover">
    <tr>
   		<th ng-click="sort('idCarro')">Modelo </th>
        <th ng-click="sort('modelo')">Modelo </th>
        <th ng-click="sort('ano')">Ano</th>
        <th ng-click="sort('cor')">Cor</th>
        <th ng-click="sort('quilometragem')">Quilometragem</th>
        <th width="5%"> </th>
        <th width="5%"> </th>
    </tr>   
       <tr dir-paginate="x in carros |orderBy:sortKey:reverse|filter:search|itemsPerPage:10">
        	<td>{{x.idCarro}}</td>
            <td>{{x.modelo}}</td>
            <td>{{x.ano}}</td>
            <td>{{x.cor}}</td>
            <td>{{x.quilometragem}}</td>
			<td><a class="btn btn-sm btn-success" href="edit/{{x.idCarro}}"><i class="fa fa-edit" title="Editar" aria-hidden="true"></i></a></td>
			<td><a class="btn btn-sm btn-danger" ng-click="remover(x.idCarro)"><i class="fa fa-trash-o" title="Delete" aria-hidden="true"></i></a></td>
        </tr>
    </table>
     <dir-pagination-controls
       max-size="5"
       direction-links="true"
       boundary-links="true" >
    </dir-pagination-controls>
 </div>  
	<script>
		var app = angular.module('myApp',['angularUtils.directives.dirPagination']);
		app.controller('crud', function($scope, $http) {
			$scope.listar = function() {
			$http.get("json/list")
		    .then(function (response) {$scope.carros = response.data;});
			}
			$scope.listar();
		    $scope.sort = function(keyname){
		        $scope.sortKey = keyname;   //set the sortKey to the param passed
		        $scope.reverse = !$scope.reverse; //if true make it false and vice versa
		    }
		    
		    $scope.remover = function(id) {
		    	if (confirm("Tem certeza que deseja remover?")){
				$http.get("delete/"+id)
			    .then(function (response) {
			    	alert("Removido")
					$scope.listar();
			    });
			  }
		    }
		    	
		});
		

    </script>