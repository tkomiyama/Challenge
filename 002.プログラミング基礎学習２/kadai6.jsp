<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  /** ６．while文を利用して、以下の処理を実現してください。
　　　　1000を2で割り続け、100より小さくなったらループを抜ける処理 */
int a = 1000;

while(a >= 100){
  a = a / 2;
}
out.println(a);
%>
