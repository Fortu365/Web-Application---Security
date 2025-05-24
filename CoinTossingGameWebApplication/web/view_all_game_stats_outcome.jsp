<%-- 
    Document   : view_all_game_stats_outcome
    Created on : 23 May 2025, 10:44:56 PM
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
        <h1>view_all_game_stats_outcome</h1>
        <%
            List<GameStatistics> statsAllList = (List<GameStatistics>)request.getAttribute("statsAllList");
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
            <%
                    for(GameStatistics k : statsAllList){
                        %>
            <tr>
                
                        <td><%=k.getPlayerName()%></td>
                        <td><%=k.getPlayerId()%></td>
                        <td><%=k.getTotNumGamesPlayed()%></td>
                        <td><%=k.getTotNumGamesSiriWon()%></td>
                        <td><%=k.getTotNumGamesPlayerWon()%></td>
                        <td>
                    <%
                        for(String l : k.getListofSiriToss()){
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
                        for(String l : k.getListofPlayerGuess()){
                            %>
                            <ol>
                                <li><%=l%></li>
                            </ol>
                            
                            <%
                        }
                    %>
                </td>
                <td><%=k.getCreationDate()%>></td>
                        
                        <%
                    }
                %>   
            </tr>
        </table>
            <br>
            <ul>
                <li><a href="menu.jsp">Menu Page</a></li>
            </ul>
        <a href="LogoutServlet">LOGOUT</a>
        
    </body>
</html>
