<%-- 
    Document   : SubAllot2
    Created on : Oct 8, 2019, 3:00:02 AM
    Author     : Manju
--%>

<%@page import="java.util.Iterator"%>
<%@page import="dao.SubjectAllotDAO"%>
<%@page import="dto.SubAllotDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String f_id = request.getParameter("F_id");
        String f_name = request.getParameter("F_Name");
        String department =request.getParameter("department");
        SubjectAllotDAO a1 = new SubjectAllotDAO();
        List<SubAllotDTO> l1 =a1.subjectallot(department);
        
        Iterator<SubAllotDTO> i1= l1.iterator();
        
       %>
       
       
    </body>
</html>
