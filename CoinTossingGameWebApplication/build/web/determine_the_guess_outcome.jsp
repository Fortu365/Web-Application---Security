<%-- 
    Document   : determine_the_guess_outcome
    Created on : 23 May 2025, 9:39:05 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>determine_the_guess_outcome</h1>
        <%
            String playerName = (String)session.getAttribute("playerName");
            String playerGuess = (String)request.getAttribute("playerGuess");
            String outcome = (String)request.getAttribute("outcome");
            
            String compGuess = (String)request.getAttribute("compGuess");
            String compName = getServletContext().getInitParameter("compName");
        %>
        
        <p>
            <%=playerName%> Guess: <b><%=playerGuess%></b> <br>
            <%=compName%> Guess: <b><%=compGuess%></b> <br>
            Outcome : <b><%=outcome%></b>
        </p>
        
        <ol>
            <li><a href="user_play_game.jsp">Play Again</a></li>
            <li><a href="menu.jsp">Menu Page</a></li>
            <li><a href="EndGameServlet">End Game</a></li>
            
        </ol>
    </body>
</html>
