/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp.servlets;

import com.tp.beans.Client;
import com.tp.control.Clients;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tp.control.Clients;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author alilo
 */
public class AffiClis extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Client client = new Client();
        //client.setNom(request.getParameter("nom"));
       // client.setPrenom(request.getParameter("prenom"));
       client.setNom("alilo");
       client.setPrenom("ali");
       
         List<Client> clients = new ArrayList<Client>();
         clients.add(client);
      //  request.setAttribute("Clients", tableClients.recupererClients());
        request.setAttribute("Clients", clients); 
       RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/AfficherClis.jsp");
                        rd.forward(request, response);
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        Client client = new Client();
        //client.setNom(request.getParameter("nom"));
       // client.setPrenom(request.getParameter("prenom"));
       client.setNom("alilo");
       client.setPrenom("ali");
       
         List<Client> clients = new ArrayList<Client>();
         clients.add(client);
      //  request.setAttribute("Clients", tableClients.recupererClients());
        request.setAttribute("Clients", clients); 
       RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/AfficherClis.jsp");
                        rd.forward(request, response);
    }
    
    
}
