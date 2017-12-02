<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
            table{
                border: 1px solid black;
            }
            th {
                background-color: #4CAF50;
                color: white;
            }
            th, td {
                border-bottom: 1px solid #ddd;
                padding: 10px;
                text-align: left;
            }
            a {
                background-color: white;
                color: black;
                border: 1px solid #4CAF50;
                padding: 5px 10px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
            }

            a:hover {
                background-color: #4CAF50;
                color: white;
            }
        </style>
    </head>
    <body>
        <a href="/spring">< back</a><br>
        <h3>Persons list</h3>
        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${persons}" var="p">
                    <tr>
                        <td>${p.getId()}</td>
                        <td>${p.getName()}</td>
                        <td>${p.getEmail()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
