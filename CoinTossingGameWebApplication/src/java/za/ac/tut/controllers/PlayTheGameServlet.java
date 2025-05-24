/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class PlayTheGameServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String compName = getServletContext().getInitParameter("compName");
        String compGuess = "";
        
        Random randomizer = new Random();
        Integer value = randomizer.nextInt(2) + 1;
        
        if(value == 1){
            compGuess = "Heads";
        }
        else if(value == 2){
            compGuess = "Tails";
        }
        
        session.setAttribute("compGuess", compGuess);
        response.sendRedirect("user_play_game.jsp");
    }

}
