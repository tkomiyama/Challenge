/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author t
 */

/**課題1:自分のプロフィール(名前、生年月日、自己紹介)を3行に分けて表示するユーザー定義メソッドを作り、
 * メソッドを10回呼び出して下さい

  課題4:課題1で定義したメソッドに追記する形として、戻り値　true(boolean)　を返却するように修正し、
  * メソッドの呼び出し側でtrueを受け取れたら「この処理は正しく実行できました」、
  * そうでないなら「正しく実行できませんでした」と表示する */

public class kadai1 {
    public static void main(String[] args){
        
        for(int i=0; i<10; i++){
            if(outProfile(getProfile())){
                System.out.println("この処理は正しく実行できました\r\n");
            }else{
                System.out.println("正しく実行できませんでした\r\n");
            }
        }
    }
    
    static String getProfile(){
        String a =
        "名前：小宮山拓也\r\n"+
        "生年月日：1987年4月10日\r\n"+
        "よろしくおねがいします。";
        return a;
    }
    
    static boolean outProfile(String profile){
        System.out.println(profile);
        return true;
    }
    
}

