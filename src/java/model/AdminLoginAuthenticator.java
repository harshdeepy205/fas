/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.UserAdminDTO;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class AdminLoginAuthenticator {
     public boolean isLogin(UserAdminDTO user)
    {
        String username = user.getUsername();
        String password = user.getPassword();
    
String tablePassword="";
         try
         {
             Statement st=DBConnector.getStatement();
            
             
              String query="select password from admin where username='"+username+"'";
              System.out.println("Query= "+query);
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                tablePassword=rs.getString(1);
            }
            else
            {
                return false;
            }
             
             
         }
         catch(SQLException e)
                {
                    System.out.println(e);
                }
        
        if(username!=null && password!=null && !username.trim().equals("") && !password.trim().equals("")  && password.equals(tablePassword))
        {
            return true;
        }
        return false;
    }
    
}