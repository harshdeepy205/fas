/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnector;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author admin
 */
public class UserDataDAO 
{
    public List<UserDTO> getAllUserData()
    {
        List<UserDTO> listOfAllUser=new ArrayList<UserDTO>();
        
        try
        {
        Statement st=DBConnector.getStatement();
        
        String query="Select * from student";
        
        ResultSet rs=st.executeQuery(query);
        
        System.out.println("query:" +query);
        
        while(rs.next())
        {
            UserDTO userDTO=new UserDTO();
            userDTO.setE_no(rs.getString(1));
            userDTO.setS_name(rs.getString(2));
            userDTO.setBatch(rs.getString(3));
            userDTO.setBranch(rs.getString(4));
            userDTO.setDob(rs.getString(5));
            userDTO.setEmail(rs.getString(6));
            userDTO.setUpassword(rs.getString(7));
            
            listOfAllUser.add(userDTO);
        }
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return listOfAllUser;
    }
   
    public UserDTO getSpecificUserData(String username)
    {
        UserDTO userDTO=null;
        
        try
        {
        Statement st=DBConnector.getStatement();
        
        String query="Select * from student where E_no='"+username+"'";
        
        ResultSet rs=st.executeQuery(query);
        
        System.out.println("query:" +query);
        
        if(rs.next())
        {
            userDTO=new UserDTO();
            userDTO.setE_no(rs.getString(1));
            userDTO.setS_name(rs.getString(2));
            userDTO.setBatch(rs.getString(3));
            userDTO.setBranch(rs.getString(4));
            userDTO.setDob(rs.getString(5));
            userDTO.setEmail(rs.getString(6));
            userDTO.setUpassword(rs.getString(7));
        }
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return userDTO;
    }
    
    


}
