<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%
  /** ７．以下の順番で、要素が格納された配列を作成してください。
　　　　"10", "100", "soeda", "hayashi", "-20", "118", "END"

      ８．７で作成した配列の"soeda"を"33"に変更してください。 */
  ArrayList<String> a = new ArrayList<String>();

  a.add("10");
  a.add("100");
  a.add("soeda");
  a.add("hayashi");
  a.add("-20");
  a.add("118");
  a.add("END");

  a.set(2, "33");

  for(String val : a){
    out.println(val + "<br>");
  }
%>
