package shapes;

public class Rectangle {

    protected static double length;
    protected static double with;

    public Rectangle(double length, double with) {
        this.length = length;
        this.with = with;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }


    public  double getArea(){
        return length*with;
    }


    public  double getPerimeter(){
        return 2*(length+with);
    }
}
