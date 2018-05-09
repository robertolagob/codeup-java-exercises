package card_games;

import java.util.Arrays;

public class CardsArray {


    //method that return a cards array with a single Suit and consecutive numeric value from 1 to 12

    static public Card[] createCards(String suite){
        Card [] brand=new Card[13];
        for (int i=1;i<=13;i++){
            brand[i-1]=new Card(i,suite);
        }
        return brand;
    }

    static public Card[] addSuitCards(Card[] suitCards,Card[]temporal){
        for(int i=0;i<12;i++){
            temporal= Arrays.copyOf(temporal,temporal.length+1);
            temporal[temporal.length-1]=suitCards[i];
        }
        return temporal;
    }


    static public Card[] cardsSet(){
        Card[] fullSet=new Card[0];
        String[] suits={"Spade","Clove","Diamond","Heart"};

        for (int i=0;i<4;i++){
            fullSet=addSuitCards(createCards(suits[i]),fullSet);
        }
        return fullSet;
    }






}
