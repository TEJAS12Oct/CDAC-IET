<html>
<%@page import="java.util.*" %>

<body>
   <%@include file="inputitem.jsp" %>
   <ul>
   <% ArrayList<String> al = (ArrayList<String>)session.getAttribute("list");  
   
      for(String s : al)
       {
   %>
   <li><%=s %></li>
   <% } %>
   </ul>
   
</body>
</html>