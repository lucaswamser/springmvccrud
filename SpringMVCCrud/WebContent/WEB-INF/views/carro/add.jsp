<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form:form method="POST" commandName="carro">
	<form:input path="idCarro" readonly="true" style="display:none;" />
	<div class="form-group">
	<label>Modelo:</label>
	<form:input path="modelo" class="form-control" type="text" ng-model="modelo"/>
	<form:errors path="modelo" cssClass="error" />
	</div>
	<div class="form-group">
	<label>Quilometragem (KM):</label>
	<form:input  class="form-control" path="quilometragem" type="number"/>
	</div>
	<div class="form-group">
	<label>Ano:</label>
	<form:input class="form-control" path="ano" type="number"/>
	</div>
	<div class="form-group">
	<label>Cor:</label>
	<form:select class="form-control" path="cor">
	<form:option value="Azul">Azul</form:option>
	<form:option value="Vermelho">Vermelho</form:option>
	<form:option value="Verde">Verde</form:option>
	</form:select>
	</div>
	<div class="form-group">
	<c:if test="${empty carro.idCarro}">
	<input type="submit" class="btn btn-primary" value="Cadastrar">
 	</c:if>
 	<c:if test="${!empty carro.idCarro}">
 	<input type="submit" class="btn btn-primary" value="Editar">
 	 </c:if>
 	 </div>
</form:form>
