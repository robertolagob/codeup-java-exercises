package shapes;

public class Circle extends Shape implements Measurable{
    private  int circleCount = 0;
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public int getCircleCount() {
        return circleCount;
    }
}