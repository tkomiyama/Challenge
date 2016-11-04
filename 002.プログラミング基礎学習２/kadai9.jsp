<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.util.*"%>
<%
  /**９．以下の順で、連想配列を作成してください。
　　　　"1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20" */
  HashMap<String,String> a = new HashMap<String,String>();

  a.put("1","AAA");
  a.put("hello","world");
  a.put("soeda","33");
  a.put("20","20");

  out.println(a.get("1"));
  out.println(a.get("hello"));
  out.println(a.get("soeda"));
  out.println(a.get("20"));
  out.println("<br>");

  for(Map.Entry<String,String> val : a.entrySet()){
    out.println(val.getKey());
    out.println(val.getValue());
  }
%>
