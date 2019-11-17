/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Manju
 */
public class RegistorAuthenticator {
    Connection con=DBConnector.getConnection();
   
    public boolean isRegister(UserDTO user)
    {
        String enrollment=user.getE_no();
        String name=user.getS_name();
        String batch=user.getBatch();
        String branch=user.getBranch();
        String dob=user.getDob();
        String email=user.getEmail();
        String password=user.getPassword();
        
        System.out.println(password);
         try
        {
            
            Statement st=con.createStatement();
            String query1="Select E_no from student where E_no='"+enrollment+"'";
            ResultSet rs=st.executeQuery(query1);
            System.out.println("Query:"+query1);
        
       
           
                     if(rs.next())
                     {
                         return false;
                     }
                     else
                     {
                        PreparedStatement pst=con.prepareStatement("Insert into student values(?,?,?,?,?,?,?)");
                         
                         pst.setString(1,enrollment);
                         pst.setString(2,name);
                         pst.setString(3,batch);
                         pst.setString(4,branch);
                         pst.setString(5,dob);
                         pst.setString(6,email);
                         pst.setString(7,password);
                         System.out.println(pst.toString());
                         int i=pst.executeUpdate();
                         if(i>0)
                         {
                             return true;
                         }
                         else
                         {
                             System.out.println("Registration Unsuccesfull");
                         }
                     }
             
            }
            catch(SQLException e)
        {
            System.out.println(e);
        }
        
        if(enrollment!=null && password!=null && !password.trim().equals("") && password.equals(password))
        {
            return true;
        }
        return false;
    }
}
