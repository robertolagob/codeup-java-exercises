
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String [] args){
        System.out.println("enter a integer number");
        Scanner ls=new Scanner(System.in);
        int userInput=ls.nextInt();
        ls.nextLine();
        System.out.println(userInput);
        System.out.println("enter the fist word");
        String pal1;
        pal1  =ls.nextLine() ;
        System.out.println("enter the second word");
        String pal2 ;
        pal2=ls.nextLine() ;
        System.out.println("enter the third word");
        String pal3=ls.nextLine()  ;
        System.out.println(pal1);
        System.out.println(pal2);
        System.out.println(pal3);
        ls.nextLine();
        System.out.println("enter a sentence");
        String sentence=ls.nextLine();
        System.out.println(sentence);
        System.out.println("let's calculate the classroom perimeter!!");
        System.out.println("enter the length");
        float largo=ls.nextInt();
        System.out.println("enter the width");
        float ancho=(float)ls.nextInt();
        float perimeter=(largo*2)+(ancho*2);
        float area=largo*ancho;
        System.out.println("the perimeter is "+perimeter);
        System.out.println("the area is "+ area);
        boolean esta=true;

    }
}
