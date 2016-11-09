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

/** 課題6:引き数に1つのid(数値)をとり、3人分のプロフィール(項目は課題5参照)をあらかじめメソッド内で定義しておく。
 * 引き数のid値により戻り値として返却するプロフィールを誰のものにするか選択する。それ以降などは課題5と同じ扱いに

課題7:課題6の3人分のプロフィールのうち1人だけ住所が値nullの状態で定義し、
* ループ処理で全員分のプロフィールをid以外表示する処理を実行する。
* この際、歯抜けになっているデータはcontinueで飛ばす

課題8:先にInteger limit=2を定義しておき、課題7の処理のうち2人目(limitで定義した値の人数)まででループ処理を抜けるようにする*/

public class kadai6 {
    public static void main(String[] args){
        
        int limit = 2;
        for(int a=1; a<=4; a++){
            if(a > limit){
                break;
            }
            String seito[] = syusseki(a);
        
            for(int b=1; b<seito.length; b++){
                if(seito[b] == null){
                    continue;
                }
                System.out.println(seito[b]);
            }
        }
    }
    
    public static String[] syusseki(int a){
        String[] b = new String[4];
        switch(a){
        
            case 1:
                b[0] = "001";
                b[1] = "Aさん";
                b[2] = "4月5日";
                b[3] = "埼玉県";
                break;
            
            case 2:
                b[0] = "002";
                b[1] = "Bさん";
                b[2] = "5月5日";
                b[3] = null;
                break;
                
            case 3:
                b[0] = "003";
                b[1] = "Cさん";
                b[2] = "6月5日";
                b[3] = "東京都";
                break;
        }
        return b;
    }
    
}
