<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  //４．定数と変数を宣言し、それぞれに数値を入れて四則演算を行ってください。
  final int a = 2;
  int b = 10;
  int c,d,e,f,g;

  c = b + a;
  d = b - a;
  e = b * a;
  f = b / a;
  g = b % a;

  out.println(c+"<br>");
  out.println(d+"<br>");
  out.println(e+"<br>");
  out.println(f+"<br>");
  out.println(g+"<br>");
%>
