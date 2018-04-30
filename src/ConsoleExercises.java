
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String [] args){
        System.out.println("enter a integer number");
        Scanner ls=new Scanner(System.in);
        int userInput=ls.nextInt();
        ls.nextLine();
        System.out.println(userInput);

        System.out.println("enter the fist word");
        String pal1=ls.next();
        String pal2=ls.next();
        String pal3=ls.next()  ;
        System.out.println(pal1+pal2+pal3);

        ls.nextLine();

        System.out.println("enter a sentence");
        String sentence=ls.nextLine();
        System.out.println(sentence);

        System.out.println("let's calculate the classroom perimeter!!");
        System.out.println("enter the length");
        String stringlargo=ls.next();
        double largo=Double.parseDouble(stringlargo);
        System.out.println("enter the width");
        String stringancho=ls.next();
        double ancho=Double.parseDouble(stringancho);
        double perimeter=(largo*2)+(ancho*2);
        double area=largo*ancho;
        System.out.println("the perimeter is "+perimeter);
        System.out.println("the area is "+ area);


    }


}
