<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%> 
<%
session.invalidate();
response.sendRedirect("AdminLogIn.jsp");
%>