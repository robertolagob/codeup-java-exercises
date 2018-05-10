package shapes;

public class ShapesTest {

    public static void main(String[] args) {


       Measurable myShape=new Circle(4);
        System.out.println("The Circumference measure is: "+myShape.getPerimeter());

        myShape=new Rectangle(2,3);
        System.out.println("the rectangle perimeter is: "+myShape.getPerimeter());
        System.out.println("the rectangle area is"+myShape.getArea());
    }
}
