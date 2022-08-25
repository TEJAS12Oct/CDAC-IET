<html>
<%@page import="java.util.*"%>
<body>
    <u1>
        <b>Global Products</b>
    <% ArrayList<String> lists=(ArrayList<String>)request.getAttribute("globalProduct");
       for(String item:lists)
       {%>
        <li><%=item %></li>


      <% }%>
      

      <b>Session Products</b>
      <% 
      List<String> lists2=new ArrayList<String>();
      lists2=(ArrayList<String>)session.getAttribute("list");
        for(String item2 : lists2)
        {%>
         <li><%=item2 %></li>
 
 
       <% }%>
    </u1>
     <a href="inputitem">Add Item</a> 

    



</body>

</html>