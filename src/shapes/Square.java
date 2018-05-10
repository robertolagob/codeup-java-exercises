package shapes;
import java.lang.Math;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length=length;
    }

    @Override
    public void setWith(double with) {

    }
}
