<%-- 
    Document   : allot
    Created on : Sep 20, 2019, 1:49:00 PM
    Author     : Admin
--%>

<%@page import="java.util.Iterator"%>
<%@page import="dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@page import="dto.SubjectDTO"%>
<%@page import="dto.SubjectDTO"%>
<%@page import="dao.SubjectDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DBConnector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Allot Subject</title>
    </head>
    
        
       
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
        
        
           </td>
            </tr>
           
        
    
</html>
