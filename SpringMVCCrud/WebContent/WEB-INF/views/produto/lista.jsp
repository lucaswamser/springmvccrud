<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<a href="add" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Adicionar</a>
	<br><br>
    <table class="table table-hover" ng-app="myApp" ng-controller="customersCtrl">
    <tr>
        <th>Id</th>
        <th>Nome</th>
        <th>Preco</th>
        <th width="5%"> </th>
        <th width="5%"> </th>
    </tr>
        <tr  ng-repeat="x in produtos">
            <td>{{x.idProduto}}</td>
            <td>{{x.nome}}</td>
            <td>{{x.preco}}</td>
			<td><a class="btn btn-xs btn-success" href="edit/{{x.idProduto}}">Editar</a></td>
			<td><a class="btn btn-xs btn-danger" href="delete/{{x.idProduto}}">Excluir</a></td>
        </tr>
    </table>
	<script>
		var app = angular.module('myApp', []);
		app.controller('customersCtrl', function($scope, $http) {
		    $http.get("json/list")
		    .then(function (response) {$scope.produtos = response.data;});
		});
    </script>
