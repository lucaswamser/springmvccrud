<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form:form method="POST" commandName="fornecedor">
	<form:input path="idFornecedor" readonly="true" style="display:none;" />
	<div class="form-group">
	<label>Razão Social:</label>
	<form:input path="nome" class="form-control" type="text"/>
	<form:errors path="nome" cssClass="error" />
	</div>
	<div class="form-group">
	<label>Cnpj:</label>
	<form:input path="cnpj" class="form-control" type="text"/>
	<form:errors path="cnpj" cssClass="error" />
	</div>
	<div class="form-group">
	<label>Telefone:</label>
	<form:input path="telefone" class="form-control" type="tel"/>
	<form:errors path="telefone" cssClass="error" />
	</div>

	<div class="form-group">
	<c:if test="${empty fornecedor.idFornecedor}">
	<input type="submit" class="btn btn-primary" value="Cadastrar">
 	</c:if>
 	<c:if test="${!empty fornecedor.idFornecedor}">
 	<input type="submit" class="btn btn-primary" value="Editar">
 	 </c:if>
 	 </div>
</form:form>
