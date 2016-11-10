/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author t
 */
public class Dealer extends Human {
        ArrayList<Integer> cards = new ArrayList<Integer>();
        Random rand = new Random();
        ArrayList<Integer> draw = new ArrayList<Integer>();
//初期処理でこのcardsに全てのトランプを持たせる
    Dealer(){
        for(int a=1; a<14; a++){
            for(int b=0; b<4; b++){
                cards.add(a);
            }
        }
    }
    
//@override  ArrayListで受けたカード情報をmyCardsに追加する
    public void setCard(ArrayList<Integer> a){
        for(int i=0; i<a.size(); i++){
                myCards.add(a.get(i));
        }
    }
    
//@override  myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却する
    public boolean checkSum(){
        boolean a = false;
        if(open() < 17){
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
            if(aceCheck() && ace && a>21){ // Aの処理
                        a = a - 10;
                        ace = false; }
        }
        return a;
    }
    
//cardsからランダムで2枚のカードをArrayListにして返却
    public ArrayList<Integer> deal(){
        Random rand = new Random();
        ArrayList<Integer> draw = new ArrayList<Integer>();
        int i;
        for(int a=0; a<2; a++){
            i = rand.nextInt(cards.size());
            draw.add(cards.get(i));
            cards.remove(i);
        }
        return draw;
    }
    
//cardsからランダムで1枚のカードをArrayListにして返却
    public ArrayList<Integer> hit(){
        Random rand = new Random();
        ArrayList<Integer> draw = new ArrayList<Integer>();
        int i = rand.nextInt(cards.size());
        draw.add(cards.get(i));
        cards.remove(i);
        return draw;
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
