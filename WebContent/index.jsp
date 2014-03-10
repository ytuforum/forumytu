<%@page import="java.io.File"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="includes/header.jsp"></jsp:include>
        <jsp:include page="includes/menu.jsp"></jsp:include>
        <div class="container">
            <div class="row">
        		<div ng-include="data.html"></div>
        		 {{script}}
            </div>
        </div>
<jsp:include page="includes/footer.jsp"></jsp:include>
            