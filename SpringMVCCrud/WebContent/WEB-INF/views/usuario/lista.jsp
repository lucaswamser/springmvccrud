<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<a href="add" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Adicionar</a>
	<br><br>
    <table class="table table-hover">
    <tr>
        <th>Nome</th>
        <th>Usuário</th>
        <th>Ativo</th>
        <th width="5%"> </th>
        <th width="5%"> </th>
    </tr>
    <c:forEach items="${usuarios}" var="usuario">
        <tr>
            <td>${usuario.nome}</td>
            <td>${usuario.usuario}</td>
            <c:if test="${usuario.ativo}">
            <td><span class="label label-success">Ativo</span></td>
            </c:if>
            <c:if test="${!usuario.ativo}">
            <td><span class="label label-danger">Desativado</span></td>
            </c:if>
			<td><a class="btn btn-xs btn-success" href="edit/${usuario.idUsuario}">Editar</a></td>
			<td><a class="btn btn-xs btn-danger" href="delete/${usuario.idUsuario}">Excluir</a></td>
        </tr>
    </c:forEach>
    </table>

