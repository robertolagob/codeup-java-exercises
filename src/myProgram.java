import java.util.Scanner;

public class myProgram {


        public static void main(String[] args){


            String userInput;


            Scanner sc;

            sc=new Scanner(System.in);

            System.out.println("enter something: ");
            userInput=sc.nextLine();
            System.out.println("you entered "+userInput);

            sc.nextLine();// to clean the sc variable.
            int favoriteNumber;
            System.out.println("enter your favorite number");
            favoriteNumber=sc.nextInt();
            System.out.println("your favorite number is"+favoriteNumber);


    }
}
