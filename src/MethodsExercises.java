public class MethodsExercises {


    // a product of two numbers using recursion
    static public int multiRecursion(int multiplicand,int multiplier){

        if (multiplier==1){
            return multiplicand;
        }
        return multiplicand+multiRecursion(multiplicand,multiplier-1);
    }

// factorial of a number using recursion
    static public int factorial(int numero){

        if (numero==1){
            return numero;
        }

        return numero*(factorial(numero-1));
    }


    public static void main(String[] args) {
        System.out.println(multiRecursion(4, 4));
        System.out.println(factorial(3));
    }
}
