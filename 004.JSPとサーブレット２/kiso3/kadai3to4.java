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

/** 課題3:引き数が3つのメソッドを定義する。
 * 1つ目は適当な数値を、2つ目はデフォルト値が5の数値を、最後はデフォルト値がfalse(boolean)のtypeを引き数として定義する。
 * 1つ目の引き数に2つ目の引き数を掛ける計算をするメソッドを作成し、typeがfalseの時はその値を表示、trueのときはさらに2乗して表示する。 */

public class kadai3 {
    public static void main(String[] args){
        keisan(2,3,true);
    }
    
    public static void keisan(int a){
        int b = 5;
        boolean c = false;
        int kotae = a * b;
        if(c == true){
            kotae = kotae * kotae;
        }
        System.out.println(kotae);
    }
    
    public static void keisan(int a, int b){
        boolean c = false;
        int kotae = a * b;
        if(c == true){
            kotae = kotae * kotae;
        }
        System.out.println(kotae);
    }
    
    public static void keisan(int a, boolean c){
        int b = 5;
        int kotae = a * b;
        if(c == true){
            kotae = kotae * kotae;
        }
        System.out.println(kotae);
    }
    
    public static void keisan(int a, int b, boolean c){
        int kotae = a * b;
        if(c == true){
            kotae = kotae * kotae;
        }
        System.out.println(kotae);
    }
    
    public static void keisan(){
        System.out.println("値を入力してください");
    }
}
