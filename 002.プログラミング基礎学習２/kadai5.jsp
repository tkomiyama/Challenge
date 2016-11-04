<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  // ５．for文を利用して、0から100を全部足す処理を実現してください。
  int a = 0;

  for(int i=0; i<101; i++){
    a = a + i;
  }
  out.println(a);
%>
