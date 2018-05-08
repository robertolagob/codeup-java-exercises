package shapes;
import java.lang.Math;

public class Square extends Rectangle{

    private double side;
    public Square(double side) {
        super(side, side);

        }


        @Override
        public  double getArea(){
            System.out.println("Son class's method");
            return Math.pow(this.getLength(),2);
        }

        @Override
        public  double getPerimeter() {
            System.out.println("Son class's method");
            return 4 * (this.getWith());

        }

}
