/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegistorAuthenticator;

/**
 *
 * @author Manju
 */
public class RegisterChecker extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.sendRedirect("student.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enrollment = req.getParameter("enrollment");
        String name=req.getParameter("name");
        String batch= req.getParameter("batch");
        String branch = req.getParameter("branch");
        String dob = req.getParameter("date");
        String email = req.getParameter("email");
        String password= req.getParameter("password");
        String cpassword=req.getParameter("cpassword");
        
        
        System.out.println(password);
        
        UserDTO user=new UserDTO();
        user.setE_no(enrollment);
        user.setS_name(name);
        user.setBatch(batch);
        user.setBranch(branch);
        user.setDob(dob);
        user.setEmail(email);
        user.setPassword(password);
        
        RegistorAuthenticator authenticator=new RegistorAuthenticator();
        boolean register=authenticator.isRegister(user);
        
       
        if(register)
        {
            resp.sendRedirect("login.html");
        }
        else
        {
          resp.sendRedirect("student.html"); 
                
                
        }

    }

    
}
