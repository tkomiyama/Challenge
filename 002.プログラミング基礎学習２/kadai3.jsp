<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  // ３．for文を利用して、8を20回掛ける処理を実現してください。
  long a = 1;

  for(int i=0; i<20; i++){
    a = a * 8;
  }
  out.println(a);
%>
