<%-- 
    Document   : user_play_game
    Created on : 23 May 2025, 9:24:56 PM
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
        <h1>user_play_game</h1>
        <form action="DetermineTheGuessServlet" method="POST">
            <table>
                <tr>
                    <td>Determine Guess</td>
                    <td>
                        <select name="playerGuess">
                            <option value="Heads">Heads</option>
                            <option value="Tails">Tails</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="DETERMINE GUESS"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
