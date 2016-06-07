<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<a href="add" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Adicionar</a>
	<br><br>
    <table class="table table-hover">
    <tr>
   		<th>Id</th>
        <th>Razão</th>
        <th>Cnpj</th>
        <th>Telefone</th>
        <th width="5%"> </th>
        <th width="5%"> </th>
    </tr>
    <c:forEach items="${fornecedors}" var="fornecedor">
        <tr>
            <td>${fornecedor.idFornecedor}</td>
            <td>${fornecedor.nome}</td>
            <td>${fornecedor.cnpj}</td>
			<td>${fornecedor.telefone}</td>
			<td><a class="btn btn-sm btn-success" href="edit/${fornecedor.idFornecedor}"><i class="fa fa-edit" title="Delete" aria-hidden="true"></i></a></td>
			<td><a class="btn btn-sm btn-danger" href="delete/${fornecedor.idFornecedor}"> <i class="fa fa-trash-o" title="Delete" aria-hidden="true"></i></a></td>
        </tr>
    </c:forEach>
    </table>

