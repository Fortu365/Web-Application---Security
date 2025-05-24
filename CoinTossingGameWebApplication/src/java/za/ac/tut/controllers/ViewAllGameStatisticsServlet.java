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

/**
 *
 * @author Student
 */
public class ViewAllGameStatisticsServlet extends HttpServlet {

    @EJB GameStatisticsFacadeLocal gfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<GameStatistics> statsAllList = gfl.findAll();
        request.setAttribute("statsAllList", statsAllList);
        
        RequestDispatcher disp = request.getRequestDispatcher("view_all_game_stats_outcome.jsp");
        disp.forward(request, response);
    }

}
