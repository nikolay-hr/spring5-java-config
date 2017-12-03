<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Add person</title>
        <style>
            form{
            }
            input, select {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }

            input[type=submit] {
                width: 100%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }

            .form-group {
                max-width: 300px;
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 15px;
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
        <a href="/spring">back</a><br>
        <h3>Add new person</h3>
        <div class="form-group">

            <form method="post" action="/spring/addperson">

                <label for="fname">Name</label>
                <input id="fname" type="text" name="name" placeholder="Your name..">

                <label for="lname">Email</label>
                <input id="lname" type="email" name="email" placeholder="Your email..">

                <input type="submit" value="Submit">
            </form>


        </div>
    </body>
</html>
