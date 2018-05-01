import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a grade between 0 and 100");
        int grade=sc.nextInt();

        if(grade>0&&grade<=59){

            System.out.println("C: 59-0");
        }
        else if ((grade>=60&&grade<66)){

            System.out.println("D: 66-60");
        }
        else if ((grade<=79&&grade>67)){
            System.out.println("C: 79-67");
        }
        else if ((grade<=87&&grade>79)){
            System.out.println("C: 87-79");
        }
        else if ((grade<=100&&grade>88)){
            System.out.println("A: 100-88");
        }



    }

}
