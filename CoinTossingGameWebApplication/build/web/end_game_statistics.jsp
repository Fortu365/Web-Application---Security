<%-- 
    Document   : end_game_statistics
    Created on : 23 May 2025, 10:11:31 PM
    Author     : Student
--%>

<%@page import="entity.GameStatistics"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>end_game_statistics</h1>
        <%
            String playerName = (String)session.getAttribute("playerName");
            Integer playerId = (Integer)session.getAttribute("playerId");
            Integer totNumGamesPlayed = (Integer)session.getAttribute("totNumGamesPlayed");
            Integer totNumGamesSiriWon = (Integer)session.getAttribute("totNumGamesSiriWon");
            Integer totNumGamesPlayerWon = (Integer)session.getAttribute("totNumGamesPlayerWon");
            List<String> listofSiriToss = (List<String>)session.getAttribute("listofSiriToss");
            List<String> listofPlayerGuess = (List<String>)session.getAttribute("listofPlayerGuess");
            
            GameStatistics stats = (GameStatistics)request.getAttribute("stats");
        %>
        
        <table border="1">
            <tr>
                <th>Name</th>
                <th>Id</th>
                <th>Num Games Played</th>
                <th>Num Times Siri Won</th>
                <th>Num Times Player Won</th>
                <th>Siri Toss</th>
                <th>Player Guess</th>
                <th>Time Stamp</th>
            </tr>
            <tr>
                <td><%=playerName%></td>
                <td><%=playerId%></td>
                <td><%=totNumGamesPlayed%></td>
                <td><%=totNumGamesSiriWon%></td>
                <td><%=totNumGamesPlayerWon%></td>
                <td>
                    <%
                        for(String l : listofSiriToss){
                            %>
                            <ol>
                                <li><%=l%></li>
                            </ol>
                            
                            <%
                        }
                    %>
                </td>
                <td>
                    <%
                        for(String l : listofPlayerGuess){
                            %>
                            <ol>
                                <li><%=l%></li>
                            </ol>
                            
                            <%
                        }
                    %>
                </td>
                
                <td><%=stats.getCreationDate()%></td>
            </tr>
        </table>
            <br>
        <a href="LogoutServlet">LOGOUT</a>
    </body>
</html>
