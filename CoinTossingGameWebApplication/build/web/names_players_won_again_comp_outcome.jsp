<%-- 
    Document   : names_players_won_again_comp_outcome
    Created on : 23 May 2025, 11:21:43 PM
    Author     : Student
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>names_players_won_again_comp_outcome</h1>
        <%
            List<String> playerNames = (List<String>)request.getAttribute("playerNames");
        %>
        
        <table>
            <tr>
                <%
                        for(String k : playerNames){
                            %>
                <td>
                    <%=k%>
                          
                </td>
                <%  
                        }
                    %>
            </tr>
        </table>
            
            <ul>
                <li><a href="menu.jsp">Menu Page</a></li>
            </ul>
        <a href="LogoutServlet">LOGOUT</a>
    </body>
</html>
