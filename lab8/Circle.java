package lab8;

class Circle {
    private double radius;
    private String color;
    final double PI = 3.1415926535;
    
    public Circle() {
        radius = 1.0;
        color = "yellow";
    }

    public Circle(double inRadius, String inColor) {
        radius = inRadius;
        color = inColor;
    }

    public void setRadius(double inRadius) {
        radius = inRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String inColor) {
        color = inColor;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return PI * 2 * radius;
    }

    public String toString() {
        return ("Radius: " + radius + ", Color: " + color);
    }

    public Circle addRadius(Circle other) {
        Circle retCircle = new Circle();
        retCircle.setRadius(radius + other.getRadius());
        retCircle.setColor("red");

        return retCircle;
    }

    public static Circle addRadius(Circle circle1, Circle circle2) {
        Circle retCircle = new Circle();
        retCircle.setRadius(circle1.getRadius() + circle2.getRadius());
        retCircle.setColor("purple");

        return retCircle;
    }
    
}
