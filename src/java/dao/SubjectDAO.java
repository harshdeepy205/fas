/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.SubjectDTO;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SubjectDAO {
     public List<SubjectDTO> fetchSubData(String department)
    {
        List<SubjectDTO> listOfAllUser=new ArrayList<SubjectDTO>();
        System.out.println(department);
             
               Connection con=DBConnector.getConnection();
               try{
                   Statement st=con.createStatement();
                    String query="Select F_id,F_name from faculty where Department='"+department+"'";
                    System.out.println(query);
                    
                    ResultSet rs= st.executeQuery(query);
                    
        
        while(rs.next())
        {
            SubjectDTO s1=new SubjectDTO();
            s1.setF_id(rs.getString(1));
            s1.setF_Name(rs.getString(2));
            System.out.println(s1.getF_id());
            System.out.println(s1.getF_Name());
            listOfAllUser.add(s1);
        }
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return listOfAllUser;
    }
   public List<SubjectDTO> getSubData(String department)
   {
       List<SubjectDTO> l1= new ArrayList<SubjectDTO>();
       SubjectDAO s1=new SubjectDAO();
       l1=s1.fetchSubData(department);
       return l1;
   }
    
}
