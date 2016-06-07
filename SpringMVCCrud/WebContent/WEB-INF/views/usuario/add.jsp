<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
Você é ${usuario.nome}
<form:form method="POST" commandName="usuario">
	<form:input path="idUsuario" readonly="true" style="display:none;" />
	<div class="form-group">
	<label>Nome:</label>
	<form:input path="nome" class="form-control" type="text"/>
	<form:errors path="nome" cssClass="error" />
	</div>
	<div class="form-group">
	<label>Usuário:</label>
	<form:input  class="form-control" path="usuario" type="text" disabled="true"/>
	<form:errors path="usuario" cssClass="error" />
	</div>
	<div class="form-group">
	<label>Senha:</label>
	<input class="form-control" name="senha" type="password" disabled="true"/>
	</div>
	<div class="form-group">
	<label>Ativo:</label>
	<form:select class="form-control" path="ativo">
	<form:option value="true">Sim</form:option>
	<form:option value="false">Não</form:option>
	</form:select>
	</div>
	<div class="form-group">
	<c:if test="${empty usuario.idUsuario}">
	<input type="submit" class="btn btn-primary" value="Cadastrar">
 	</c:if>
 	<c:if test="${!empty usuario.idUsuario}">
 	<input type="submit" class="btn btn-primary" value="Editar">
 	 </c:if>
 	 </div>
</form:form>
