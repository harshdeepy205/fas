/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.FacultyDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class FacultyAuthenticator {
    Connection con =DBConnector.getConnection();
    
        public boolean isRegister(FacultyDTO fuser)
        {
            String fid=fuser.getF_id();
            String fname=fuser.getF_name();
            String fmail=fuser.getF_mail();
            String fpassword=fuser.getFpassword();
            String department=fuser.getDeparment();
            String dob=fuser.getDob();
            
            System.out.println(fpassword);
            
            try
                {
                 
            Connection con=DBConnector.getConnection();
            Statement st=con.createStatement();
            String query1="Select F_id from faculty where F_id='"+fid+"'";
            ResultSet rs=st.executeQuery(query1);
            System.out.println("Query:"+query1);
            
              if(rs.next())
                     {
                         return false;
                     }
                     else
                     {
                        PreparedStatement pst=con.prepareStatement("Insert into faculty values(?,?,?,?,?,?)");
                         
                         pst.setString(1,fid);
                         pst.setString(2,fname);
                         pst.setString(3,fmail);
                         pst.setString(4,fpassword);
                         pst.setString(5,department);
                         pst.setString(6,dob);
                  
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
            
            
        if(fid!=null && fpassword!=null && !fpassword.trim().equals("") && fpassword.equals(fpassword))
        {
            return true;
        }
        return false;
    }
 }
    

