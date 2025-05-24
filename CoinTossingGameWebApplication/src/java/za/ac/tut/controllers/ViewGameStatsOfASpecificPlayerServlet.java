/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controllers;

import ejb.bl.GameStatisticsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student
 */
public class ViewGameStatsOfASpecificPlayerServlet extends HttpServlet {

    @EJB GameStatisticsFacadeLocal gfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String playerNaame = request.getParameter("playerNaame");
        List<String> playerNames = gfl.viewGameStatsOfSpecificPlayers(playerNaame);
        
        request.setAttribute("playerNames", playerNames);
        RequestDispatcher disp = request.getRequestDispatcher("view_specific_player_ststs_outcome.jsp");
        disp.forward(request, response);
        
    }

}
