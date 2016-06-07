<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<form:form method="POST" commandName="produto">
	<form:input path="idProduto" readonly="true" style="display:none;" />
	
	<div class="form-group">
	<label>Fornecedor:</label>
	<form:select path="fornecedor" items="${fornecedores}" class="form-control" itemValue="idFornecedor"/>
	<form:errors path="fornecedor" cssClass="error" />
	</div>
	
	<div class="form-group">
	<label>Nome:</label>
	<form:input path="nome" class="form-control" type="text"/>
	<form:errors path="nome" cssClass="error" />
	</div>
	<div class="form-group">
	<label>Preço:</label>
	<form:input  class="form-control" path="preco" type="number" step="0.01"/>
	<form:errors path="preco" cssClass="error" />
	</div>
	<div class="form-group">
	<c:if test="${empty produto.idProduto}">
	<input type="submit" class="btn btn-primary" value="Cadastrar">
 	</c:if>
 	<c:if test="${!empty produto.idProduto}">
 	<input type="submit" class="btn btn-primary" value="Editar">
 	 </c:if>
 	 </div>
</form:form>
