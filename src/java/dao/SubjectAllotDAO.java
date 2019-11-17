/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.SubAllotDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manju
 */
public class SubjectAllotDAO {
    
   public List<SubAllotDTO> subjectallot(String department) throws SQLException
    {
        
        List<SubAllotDTO> sa=new ArrayList<SubAllotDTO>();
        
        System.out.println(department+"dao");
        
        Connection con=DBConnector.getConnection();
        
        try{
            Statement st=con.createStatement();
            
            String query ="select sub_code,sub_code from subject where branch='"+department+"' and F_id='' ";
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);
            
            
            while(rs.next())
            {
                SubAllotDTO s1=new SubAllotDTO();
                s1.setSub_code(rs.getString(1));
                s1.setSub_name(rs.getString(2));
                sa.add(s1);
            }
            
        }
        catch(SQLException sq)
        {
            System.out.println(sq);
        }
        
        
     
          return sa;
        
    }
}
