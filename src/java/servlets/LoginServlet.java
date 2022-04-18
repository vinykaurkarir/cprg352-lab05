/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author viny kaur
 */
public class LoginServlet extends HttpServlet {

      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session= request.getSession();
        User luser= (User) session.getAttribute("username");
        
        if(luser==null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        else
        {
            
            response.sendRedirect("home");
            return;
        }
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            HttpSession session=request.getSession();
            
            AccountService accountservice=new AccountService();
            User loginuser= accountservice.login(username, password);
            
            if(loginuser==null)
            {
                request.setAttribute("invalid","Invalid Credentials");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                return;
            }
            else
            {
                session.setAttribute("user", loginuser);
                response.sendRedirect("home");
                return;
            }
    }

}