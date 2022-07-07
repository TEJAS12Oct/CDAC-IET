<html>
    <body>
        <form action="Welcome" method="GET">
        <center>
          <h1>Login Page</h1>
           UserName : <input type="text"  name="username" ></input><br/>
          <br/> PassWord : <input type="text"  name="password" ></input><br/>
          <br/> <input type="submit"  value="Log In" ></input>
          <% String val=(String)request.getAttribute("al");
          if(val != null)
          {%>
            <h1>Invalid User</h1>
          <%}%>

       </center>
       </form>
    </body>
</html>