<html>
<%@page import="java.util.*" %>
<%@page import="Study.MVCDO.Birthday" %>
<body>

   <ul>
   <% ArrayList<Birthday> b1 = (ArrayList<Birthday>)request.getAttribute("al");  
   
      for(Birthday s : b1)
       {
   %>
   
   <li><%=s.getId() %></li>
   
   <% } %>
   </ul>
    


</body>
</html>
