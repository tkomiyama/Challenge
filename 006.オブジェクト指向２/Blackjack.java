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
public class Blackjack {
    public static void main(String[] args){
        Dealer dealer = new Dealer();
        User user = new User();
        
        dealer.setCard(dealer.deal());
        user.setCard(dealer.deal());
        
        while(user.checkSum(dealer.myCards.get(0))){
            user.setCard(dealer.hit());
        }
        
        while(dealer.checkSum()){
           dealer.setCard(dealer.hit());
        }
        
        System.out.print("親のカードは");
        for(int x=0; x<dealer.myCards.size(); x++){
            System.out.print(dealer.myCards.get(x) + " ");
        }
        System.out.println("合計は" + dealer.open());
        
        System.out.print("子のカードは");
        for(int x=0; x<user.myCards.size(); x++){
            System.out.print(user.myCards.get(x) + " ");
        }
        System.out.println("合計は" + user.open());
        
        
        // hanteiがtrueで親の勝ち
        boolean hantei = false;
        if(user.open() > 21){ hantei = true; }
        if(user.open() <= dealer.open() && dealer.open() < 22){ hantei = true; }
        
        if(hantei){ System.out.println("親の勝ちです。"); }
        else{ System.out.println("子の勝ちです。"); }
    }
}
