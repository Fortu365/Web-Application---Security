/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class UserDetailsServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Integer totNumGamesPlayed = 0;
    
        Integer totNumGamesSiriWon = 0;
    
        Integer totNumGamesPlayerWon = 0;
        
        List<String> listofSiriToss = new ArrayList<>();
        
        List<String> listofPlayerGuess = new ArrayList<>();
        
        String playerName = request.getParameter("playerName");
        Integer playerId = Integer.parseInt(request.getParameter("playerId"));
        
        session.setAttribute("playerName", playerName);
        session.setAttribute("playerId", playerId);
        session.setAttribute("totNumGamesPlayed", totNumGamesPlayed);
        session.setAttribute("totNumGamesSiriWon", totNumGamesSiriWon);
        session.setAttribute("totNumGamesPlayerWon", totNumGamesPlayerWon);
        session.setAttribute("listofSiriToss", listofSiriToss);
        session.setAttribute("listofPlayerGuess", listofPlayerGuess);
        
        response.sendRedirect("menu.jsp");
    }

}
