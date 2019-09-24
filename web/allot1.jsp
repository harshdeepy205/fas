<%-- 
    Document   : allot1
    Created on : Sep 20, 2019, 3:54:25 PM
    Author     : Admin
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.SubjectDAO"%>
<%@page import="dto.SubjectDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
    <tr>
        <td>F_id</td>
        <td>F_NAme</td>
    </tr>
        <% 
            SubjectDAO user1 =new SubjectDAO();
            List<SubjectDTO> listOfAllUsers= user1.getSubData();
            
            Iterator<SubjectDTO> user1=listOfAllUsers.iterator();
            
        %>
    </body>
</html>
