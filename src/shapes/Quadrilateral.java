package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected  double length;
    protected  double with;

    public Quadrilateral(double length, double with) {

        this.length=length;
        this.with=with;
    }

    public double getLength() {
        return length;
    }

    public double getWith() {
        return with;
    }

    public abstract void setLength(double length);

    public abstract void  setWith(double with);


}

