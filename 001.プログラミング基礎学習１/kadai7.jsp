<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  /** ７．クエリストリングを利用して、以下の処理を実現してください。

　スーパーのレジでレシートを作る仕組みを作成します。
　クエリストリングで総額・個数・商品種別を受け取って処理します。

①商品種別は、３つ。１：雑貨、２：生鮮食品、３：その他
　　まずは、この商品種別を表示してください。

　②総額と個数から１個当たりの値段を算出してください。
　　総額と１個当たりの値段を表示してください。

　③3000円以上購入で4%、5000円以上購入で5%のポイントが付きます。
　　購入額に応じたポイントの表示を行ってください。 */

  int so,ko,syu,ta,po;

  String a = request.getParameter("a");
  String b = request.getParameter("b");
  String c = request.getParameter("c");

  so = Integer.parseInt(a);
  ko = Integer.parseInt(b);
  syu = Integer.parseInt(c);

  ta = so / ko;

  if(syu == 1){
    out.println("商品種別は雑貨です。<br>");
  }else if(syu == 2){
    out.println("商品種別は生鮮食品です。<br>");
  }else if(syu == 3){
    out.println("商品種別はその他です。<br>");
  }
  out.println("総額" + so + "円です。<br>");
  out.println("１個あたり" + ta + "円です。<br>");

  if(so >= 3000 && so < 5000){
    po = so * 4 / 100;
    out.println("ポイントが" + po + "P付きます");
  }else if(so >= 5000){
    po = so * 5 / 100;
    out.println("ポイントが" + po + "P付きます");
  }

%>
