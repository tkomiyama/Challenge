<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  // ４．for文を利用して、"A"を30個連結する処理を実現してください。
  String a = "";

  for(int i=0; i<30; i++){
    a = a + "A";
  }
  out.println(a);
%>
