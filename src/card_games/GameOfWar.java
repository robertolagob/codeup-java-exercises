package card_games;



public class GameOfWar {


    public static void main(String[] args) {
        muestraGame(CardsArray.cardsSet());

    }


    public static void muestraGame(Card[] arreglo){
        for (int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
}
