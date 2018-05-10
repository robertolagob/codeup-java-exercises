package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double with) {
        super(length, with);
    }

    @Override
    public void setLength(double length) {
        this.length=length;
    }

    @Override
    public void setWith( double with) {
        this.with=with;
        }


    @Override
    public double getArea() {
        return length*with;
    }

    @Override
    public double getPerimeter() {
        return 2*(with+length);
    }



    }





