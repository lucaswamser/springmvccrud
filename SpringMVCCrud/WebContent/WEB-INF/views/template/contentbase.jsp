<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header"><tiles:insertAttribute name="baseTitulo" /></h1>
                    <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="../Home">Home</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Produto
                            </li>
                        </ol>
                </div>
                <!-- /.col-lg-12 -->
            </div>         
            <c:if test="${alert == 'sucesso'}">
            <div class="alert alert-success" role="alert"><b>Sucesso! </b>${message}</div>
            </c:if>   
            <c:if test="${alert == 'erro'}">
            <div class="alert alert-danger" role="alert"><b>Erro! </b>${message}</div>
            </c:if>