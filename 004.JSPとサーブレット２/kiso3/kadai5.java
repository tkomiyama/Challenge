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

/** 課題5:戻り値としてある人物のid(数値),名前,生年月日、住所を返却するメソッドを作成し、受け取った後はid以外の値を表示する */

public class kadai5 {
    public static void main(String[] args){
        String data[] = search();
        for(int i=1; i<data.length; i++){
            System.out.println(data[i] + ("\r\n"));
        }
    }
    
    public static String[] search(){
        String a[] = {"001","名前","生年月日","住所"};
        return a;
    }
    
}
