/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.util.ArrayList;

/**
 *
 * @author t
 */
public class User extends Human {
    
//           絵札の数字の変更もここで管理する
//@override  ArrayListで受けたカード情報をmyCardsに追加する
    public void setCard(ArrayList<Integer> a){
        for(int i=0; i<a.size(); i++){
                myCards.add(a.get(i));
        }
    }
//@override  myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却する
     //      Aの判定もここで行います。
    public boolean checkSum(){
        return false;
    }
    public boolean checkSum(int i){
        boolean a = false;
        if(open() < i+12 && open()<17){
            a = true;
        }
        return a;
    }
    
//@override  myCardsのカードの合計値を返却する
    public int open(){
        int a = 0;
        boolean ace = true;
        for(int i=0; i<myCards.size(); i++){
            if(myCards.get(i)>10){ a = a + 10; } //絵札の処理
            else if(a < 11 && myCards.get(i) == 1){ a = a + 11; } //Aの処理
            else{ a = a + myCards.get(i); }
            
            if(aceCheck() && a>21 && ace){ a = a - 10; ace = false;  } // Aの処理
        }
        return a;
    }
    
 //Aのチェック
    public boolean aceCheck(){
        boolean a = false;
        for(int i=0; i<myCards.size(); i++){
            if(myCards.get(i)==1){
                a = true;
            }
        }
        return a;
    }
}
