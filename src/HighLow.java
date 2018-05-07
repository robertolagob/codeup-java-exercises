import java.util.Random;
import java.util.Scanner;

public class HighLow {

        static public int numeroRandom(int numero){
            Random aleatorio = new Random(System.currentTimeMillis());
            int intAletorio = aleatorio.nextInt(numero);
            return intAletorio;
        }

    public static void myApplication() {
        Scanner sc = new Scanner(System.in);
        int myValue = numeroRandom(100);
        String confim ;
        int counter = 0;
        System.out.println("do you wanna play HighLow game?");
        confim = sc.nextLine();
        if(confim.equalsIgnoreCase("yes")) {
            System.out.println("please enter a number between 0 and 100");
            while (confim.equalsIgnoreCase("yes")) {
                int input = sc.nextInt();
                if (input == myValue) {
                    System.out.println("Great ... that's the number..." + myValue);
                    System.out.println("you did it in " + counter + "attempts");
                    myApplication();
                } else if (input < myValue) {
                    System.out.println("HIGHER");
                    counter++;
                } else if (input > myValue) {
                    System.out.println("lower");
                    counter++;
                }

                if (counter >= 20) {
                    System.out.println("you have reached the max number of intent ...let's do this again");
                    myApplication();
                }
            }
        }
    }

    public static void main(String[] args) {
        myApplication();
    }



}
