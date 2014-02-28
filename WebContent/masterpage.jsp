<%@page import="java.io.File"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%
	String pageurl = (String)request.getAttribute("pageurl");
%>
<jsp:include page="includes/header.jsp"></jsp:include>
        <jsp:include page="includes/menu.jsp"></jsp:include>
        <div class="container">
            <div class="row">
                <!-- content -->
                <jsp:include page="<%=pageurl%>"></jsp:include>
            </div>
        </div>
<jsp:include page="includes/footer.jsp"></jsp:include>
            