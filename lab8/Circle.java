package lab8;

class Circle {
    private double radius;
    private String color;
    final double PI = 3.1415926535;
    
    public Circle() {
        this.radius = 1.0;
        this.color = "yellow";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return PI * 2 * this.radius;
    }

    public String toString() {
        return ("Radius: " + this.radius + ", Color: " + this.color);
    }

    public Circle addRadius(Circle other) {
        Circle retCircle = new Circle();
        retCircle.setRadius(this.radius + other.getRadius());
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
