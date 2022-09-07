<html>
<%@page import="java.util.*" %>
<%@page import="Study.MVCDO.Birthday" %>
<body>
<table border="2">
   <tr><td>FNAME</td><td>LNAME</td></tr>
   
   <% ArrayList<Birthday> b1 = (ArrayList<Birthday>)request.getAttribute("al");  

      for(Birthday s : b1)
       {
   %>
   
  <tr><td> <%=s.getFName() %></td>
    <td> <%=s.getLname() %></td></tr>
   
   <% } %>
 
    

</table>
</body>
</html>