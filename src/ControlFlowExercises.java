public class ControlFlowExercises {
    public static void main(String[] args) {

        int number=2;
        int contador=1;
    do{
        System.out.println(number*number);
        number*=number;
        contador++;

    }
    while (contador<5);
    }
}
