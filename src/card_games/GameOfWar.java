package card_games;
import java.util.Arrays;
import java.util.Scanner;
import util.Input;

public class GameOfWar {

    public static void main(String[] args) {



        Card[] mano=CardsArray.cardsSet();
        Card[] readyToPlay=shuffled(mano);
        muestraGame(readyToPlay);
        bidimensionalArray(readyToPlay);
    }

//helper function to visualize an array of Card objects
    public static void muestraGame(Card[] arreglo){
        for (int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }

//function that generate a random number
    public static int getRandom(int total) {
        int randomIndex = (int) Math.floor(Math.random() * total);
        return randomIndex;
    }

//function that receive an ordered array of Card object and return a randomized array
    public static Card[] shuffled(Card [] gameSet){

        Card[] Gamer = new Card[48];
        int picked;
        int counter=0;

        while (gameSet.length>0)
        {
            picked=getRandom(gameSet.length);
            Gamer[counter]=gameSet[picked];
            gameSet=removeElement(gameSet,picked);
            counter++;
        }
        return Gamer;
    }

//function to remove an object (Card) from an array and reorder all the subsequent elements
     static public  Card[]  removeElement(Card[] arrayObjetos, int i) {
        Card[] nuevoArray = new Card[arrayObjetos.length - 1];
        if(i>0) {
            System.arraycopy(arrayObjetos, 0, nuevoArray, 0, i);
        }
        if (nuevoArray.length > i){
            System.arraycopy(arrayObjetos, i + 1, nuevoArray, i, nuevoArray.length - i);
        }
        return nuevoArray;
    }

    //function to part the cards set between two players, basically it returns a bi-dimensional array of randomly sorted Cards objects

    static public Card[][] bidimensionalArray(Card[] arreglo){
        Card [][] splitted=new Card[2][24];
        Card [] array1=new Card[24];
        Card [] array2=new Card[24];
        System.arraycopy(arreglo,0,array1,0,array1.length);
        System.arraycopy(arreglo,0,arreglo,24,array2.length);
        splitted[0]=array1;
        splitted[1]=array2;
        return splitted;
        }


        //function to run the game

//    static public void runTheGAme()
//    {
//
//        System.out.println("Do you wanna play the Game of War? Yes/No");
//        if(Input.yesNo()){
//
//            System.out.println("do you wanna see your deck");
//        }
//
//
//    }








}
