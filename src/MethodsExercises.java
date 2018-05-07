public class MethodsExercises {

    static public int multiRecursion(int multiplicand,int multiplier){

        if (multiplier==1){
            return multiplicand;
        }
        return multiplicand+multiRecursion(multiplicand,multiplier-1);
    }


    public static void main(String[] args) {
        System.out.println(multiRecursion(4, 4));
    }
}
