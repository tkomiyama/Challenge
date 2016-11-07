<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%
  /** １０．クエリストリングを利用して、以下の処理を実現してください。

　簡易素因数分解のロジックを作成します。

　クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
　元の値と素因数分解の結果を表示するようにしてください。
　
　2ケタ以上の素数が含まれた数値の場合は、
　「元の値　1ケタの素因数　その他」と表記して、その他　に含んでください。 */

  String kazu = request.getParameter("kazu");
  int nokori = Integer.parseInt(kazu);
  int sosu[] = {2,3,5,7};
  ArrayList<String> kekka = new ArrayList<String>();

  for(int a : sosu){
    while(nokori % a == 0){
      kekka.add(String.valueOf(a));
      nokori = nokori / a;
    }
  }
  
  if(nokori != 0){
    kekka.add("その他");
  }

  out.println("元の値：" + kazu + "<br>");
  out.println("結果：");
  for(String b : kekka){
    out.println(b + " ");
  }
%>
