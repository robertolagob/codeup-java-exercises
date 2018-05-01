import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a integer number");
        int numero=sc.nextInt();

        System.out.println("do you wanna see a secuence of squares and cubes from 1 to your entered number? Y/N");
        String approval=sc.next();

        if(approval.equalsIgnoreCase("y")){
            System.out.println("Here is your table");

            System.out.println("number | squared | cubed");
            System.out.println("_______|_________|_______");

            for (int i=1;i<=numero;i++)
            {

                int sqr=(i*i);
                int cubed=sqr*i;
                String linea=String.format("%-7s", i)+String.format("%-10s", "|"+sqr)+"|"+cubed;
//                System.out.println(i+"      |"+sqr+"       |"+cubed+"     |");
                System.out.println(linea);

            }

        }
        else if(approval.equalsIgnoreCase("N")){
            System.out.println("Have a good one");
        }
        else {
            System.out.println("You entered a wrong input");
            sc.nextLine();
        }


    }

}
