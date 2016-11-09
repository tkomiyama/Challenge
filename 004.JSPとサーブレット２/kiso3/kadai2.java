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

/** 課題2
 *   引数として数値を受け取り、その値が奇数か偶数か判別＆表示する処理をメソッドとして制作し、
 *   適当な数値に対して奇数・偶数の判別を行ってください*/

public class kadai2 {
    public static void main(String[] args){
        int suji = 5;
        System.out.println(suji + "は" + hantei(suji));
    }
    
    public static String hantei(int kazu){
        String a;
        
        if(kazu % 2 == 0){
            a = "偶数です。";
        }else{
            a = "奇数です。";
        }
        return a;
    }
}
