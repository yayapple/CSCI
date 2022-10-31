package lab8;


public class TestCircles {
    public static void main(String[] args) {

        System.out.println("Step 2");

        Circle c1 = new Circle (5.0, "blue"); 
        Circle c2 = new Circle(); 
        System.out.println(c1);
        System.out.println(c2);

        c1.setRadius(3.0);
        c1.setColor("red");

        System.out.println(c1);
        System.out.println("c1 color: " + c1.getColor());
        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c1 area: " + c1.getArea());
        System.out.println("c1 circumference: " + c1.getCircumference());
        System.out.println();

        System.out.println("Step 3");

        System.out.println(c1.addRadius(c2));
        System.out.println(Circle.addRadius(c1, new Circle(6, "green")));
    }
}