/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cg.manip.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP Notebook
 */
@WebServlet(value = "/login")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
/**
 * 
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException 
 * 
 * Recupere les données fournit par le formulaire html via la method POST
 */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               PrintWriter printWriter=response.getWriter();
               printWriter.println("Information De L'utilisateur");
               
               String nom=request.getParameter("nom");
               String prenom=request.getParameter("prenom");
               String genre=request.getParameter("genre");
               String mdp=request.getParameter("mdp");
               
              
               
               
               /*printWriter.println("Nom :"+nom+"\nPrenom :"+prenom+
                       "\nGenre :"+genre+"\nPassword :"+mdp);*/
               
               request.setAttribute("nom", nom);
                request.setAttribute("prenom", prenom);
                 request.setAttribute("genre", genre);
                  request.setAttribute("mdp", mdp);
               
               /**
                * Renvoie une page JSP
                */
               
               this.getServletContext()
                       .getRequestDispatcher("/page1.jsp")
                       .forward(request, response);
               
               
    }

}
