/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class DetermineTheGuessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String playerGuess = request.getParameter("playerGuess");
        String compGuess = (String)session.getAttribute("compGuess");
        
        String outcome = outcomeMethod(playerGuess, compGuess, session);
        
        request.setAttribute("playerGuess", playerGuess);
        request.setAttribute("compGuess", compGuess);
        request.setAttribute("outcome", outcome);
        
        RequestDispatcher disp = request.getRequestDispatcher("determine_the_guess_outcome.jsp");
        disp.forward(request, response);
        
    }
    
    private String outcomeMethod(String playerGuess, String compGuess, HttpSession session){
        String outcome = "";

        Integer totNumGamesPlayed = (Integer)session.getAttribute("totNumGamesPlayed");
        Integer totNumGamesSiriWon = (Integer)session.getAttribute("totNumGamesSiriWon");
        Integer totNumGamesPlayerWon = (Integer)session.getAttribute("totNumGamesPlayerWon");
        List<String> listofSiriToss = (List<String>)session.getAttribute("listofSiriToss");
        List<String> listofPlayerGuess = (List<String>)session.getAttribute("listofPlayerGuess");
        
        totNumGamesPlayed++;
        session.setAttribute("totNumGamesPlayed", totNumGamesPlayed);
        
        if(playerGuess.equalsIgnoreCase(compGuess)){
            outcome = "Win";
            totNumGamesPlayerWon++;
            session.setAttribute("totNumGamesPlayerWon", totNumGamesPlayerWon);
        }
        else{
            outcome = "Lost";
            totNumGamesSiriWon++;
            session.setAttribute("totNumGamesSiriWon", totNumGamesSiriWon);
        }
        
        listofSiriToss.add(compGuess);
        listofPlayerGuess.add(playerGuess);
        
        session.setAttribute("listofSiriToss", listofSiriToss);
        session.setAttribute("listofPlayerGuess", listofPlayerGuess);
        
        return outcome;
    }

        
        
        
        
}
