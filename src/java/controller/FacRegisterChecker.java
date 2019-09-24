/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.FacultyDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FacultyAuthenticator;

/**
 *
 * @author Admin
 */
public class FacRegisterChecker extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("faculty.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String F_id=req.getParameter("fid");
       String F_name=req.getParameter("fname");
       String F_mail=req.getParameter("fmail");
       String fpassword=req.getParameter("fpassword");
       String Department=req.getParameter("Department");
       String dob=req.getParameter("dob");
        System.out.println(F_id+F_name);
       FacultyDTO fuser=new FacultyDTO();
       fuser.setF_id(F_id);
       fuser.setF_name(F_name);
       fuser.setF_mail(F_mail);
       fuser.setFpassword(fpassword);
       fuser.setDeparment(Department);
       fuser.setDob(dob);
       System.out.println(fuser.getFpassword());
       FacultyAuthenticator fauthenticator=new FacultyAuthenticator();
       boolean register=fauthenticator.isRegister(fuser);
        if(register)
        {
            resp.sendRedirect("adminhome.html");
        }
        else
        {
          resp.sendRedirect("faculty.html"); 
                
                
        }

       
    }

}
