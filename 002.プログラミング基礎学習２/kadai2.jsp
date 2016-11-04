<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  /** ２．switch文を利用して、以下の処理を実現してください。
　　　　値が"A"なら「英語」、値が"あ"なら「日本語」、それ以外は何も表示しない処理*/
  char a = 'あ';
  String message = "";

  switch(a){
    case 'A':
      message = "英語";
      break;
    case 'あ':
      message = "日本語";
      break;
  }
  out.println(message);
%>
