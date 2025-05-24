/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controllers;

import ejb.bl.GameStatisticsFacadeLocal;
import entity.GameStatistics;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
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
public class EndGameServlet extends HttpServlet {

     @EJB GameStatisticsFacadeLocal gfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String playerName = (String)session.getAttribute("playerName");
        Integer playerId = (Integer)session.getAttribute("playerId");
        Integer totNumGamesPlayed = (Integer)session.getAttribute("totNumGamesPlayed");
        Integer totNumGamesSiriWon = (Integer)session.getAttribute("totNumGamesSiriWon");
        Integer totNumGamesPlayerWon = (Integer)session.getAttribute("totNumGamesPlayerWon");
        List<String> listofSiriToss = (List<String>)session.getAttribute("listofSiriToss");
        List<String> listofPlayerGuess = (List<String>)session.getAttribute("listofPlayerGuess");
        
        GameStatistics stats = new GameStatistics(playerId, playerName, totNumGamesPlayed, totNumGamesSiriWon, totNumGamesPlayerWon, listofSiriToss, listofPlayerGuess);
        gfl.create(stats);
        request.setAttribute("stats", stats);
        
        RequestDispatcher disp = request.getRequestDispatcher("end_game_statistics.jsp");
        disp.forward(request, response);
        
    }

 
}
