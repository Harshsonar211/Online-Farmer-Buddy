<%-- 
    Document   : logout
    Created on : 11 Apr, 2021, 1:53:24 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%> 
<%
session.invalidate();
response.sendRedirect("index.jsp");
%>

