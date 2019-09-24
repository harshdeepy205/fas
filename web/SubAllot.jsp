<%-- 
    Document   : allotsub
    Created on : Sep 23, 2019, 4:29:29 PM
    Author     : Manju
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dto.SubjectDTO"%>
<%@page import="dao.SubjectDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Allot Sub</title>
    </head>
    <body>
         <form action="SubAllot.jsp"  >
            
           
            <table>
            <tr>
				<td><b>Select Department:</b></td>
				<td>	<SELECT name="Department" class="opt">
				<OPTION>-----Branch-----</OPTION>			
				<OPTION>Computer Science Engineering</OPTION>
				<OPTION>Mechanical Engineering</OPTION>
				<OPTION>Electrical and Electronics Engineering</OPTION>
				<OPTION>Electronic and Communication Engineering</OPTION>
				<OPTION>Information Technology Engineering</OPTION>
				<OPTION>Civil Engineering</OPTION>
						</SELECT>
                                
                                 
                                
				</td>
			</tr>
                        
                        
                        
			<tr>
                          
				<td><input id="btn" type="submit" name="submit"/></td>
				
			</tr>
                        
                </table>        
        </form>
            
            
            
            <%
            String Department= request.getParameter("Department");
            System.out.println(Department);
            SubjectDAO a1=new SubjectDAO();
           List<SubjectDTO> l1= a1.fetchSubData(Department);
           
           Iterator<SubjectDTO> i1= l1.iterator();
           
            
            
            %><form action="">
            <table border="3" width="500" >
        <tr>
        
        <td><b>F-id</b></td>
        <td><b>F-Name</b></td>
       
        </tr>
        
        
        <%
            while(i1.hasNext())
            {
                SubjectDTO s1=i1.next();
                System.out.println(s1.getF_id());
                System.out.println(s1.getF_Name());
        %>
        
         <tr>
        <td><%=s1.getF_id() %></td>
         <input type="text" name="F_id" value="<% s1.getF_id(); %>">
        <td><%=s1.getF_Name() %></td>
        <input type="text" name="F_name" value="<% s1.getF_Name(); %>">
        
        
        <td><input type="submit" value="ALlot"></td>
        
    </tr>
    
    <%}%>
    </form>
    </body>
</html>
