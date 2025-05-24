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
public class NamesOfAllPlayersThatWonAgainstSiriServlet extends HttpServlet {

    @EJB GameStatisticsFacadeLocal gfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<String> playerNames = gfl.viewNamesOfAllPlayersThatWonAgainstSiri();
        
        request.setAttribute("playerNames", playerNames);
        RequestDispatcher disp = request.getRequestDispatcher("names_players_won_again_comp_outcome.jsp");
        disp.forward(request, response);
    }

    

}
