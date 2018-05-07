package util;
import java.util.Scanner;

public class Input {

   static private Scanner scanner;

    public Input() {
        scanner=new Scanner(System.in);
    }

    public static String getString()
    {
        return scanner.nextLine();
    }

    static public boolean yesNo(){
        String will=scanner.nextLine();
        if(will.equalsIgnoreCase("yes")||will.equalsIgnoreCase("y")) {
            return true;
        }
        else {
            return false;
        }
    }

//    static public int getInt(int min, int max){
//        int myValue;
//        do {
//            System.out.println("enter a number between " + min + "and " + max);
//            myValue = scanner.nextInt();
//        }while (myValue<min||myValue>max);
//
//        return myValue;
//    }
//    int getInt(){
//        return 0;
//    }
//    double getDouble(double min, double max){
//        return 0.0;
//    }
//    double getDouble(){
//        return 0;
//    }

    public static void main(String[] args) {

       getString();

    }


}
