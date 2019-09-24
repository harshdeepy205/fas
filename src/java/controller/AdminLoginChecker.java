/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserAdminDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AdminLoginAuthenticator;
import model.LoginAuthenticator;

/**
 *
 * @author Admin
 */
public class AdminLoginChecker extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("adminlogin.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
       String username=req.getParameter("username");
       String password= req.getParameter("password");
       
        UserAdminDTO user = new UserAdminDTO();
        user.setUsername(username);
        user.setPassword(password);
        AdminLoginAuthenticator au = new AdminLoginAuthenticator();
        boolean login= au.isLogin(user);
        if(login)
        {
            HttpSession session= req.getSession(true);
            session.setAttribute("username",username);
            resp.sendRedirect("adminhome.html");
            
        }
        else
        {
            resp.sendRedirect("adminlogin.html");
        }
       
    }
}
    