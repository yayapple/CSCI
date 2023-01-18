package project5;

/**
 * A program to declare a circle in 2D space with a Point origin and a radius.
 * @author Ethan Peterson
 *
 */
public class Circle extends Closed {
	private int radius;
	private final double pi = 3.141592653589793;
	
	/**
	 * Constructor that sets center to the x and y
	 * value and sets the radius of this Circle.
	 * @param x x coordinate of the center
	 * @param y y coordinate of the center
	 * @param radius Radius of the Circle.
	 */
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
		
	}
	
	/**
	 * Returns this Circle's radius.
	 * @return radius value of this Circle
	 */
	public int getRadius() {
		return this.radius;
	}
	
	/**
	 * Sets this Circle's radius to a given value
	 * @param radius value to set for radius
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Returns this Circle's diameter.
	 * @return twice the value of the radius
	 */
	public int diameter() {
		return this.radius * 2;
	}
	
	/**
	 * Calculates and returns this Circle's area.
	 * @return the area of this Circle
	 */
	public double area() {
		return this.radius * this.radius * pi;
	}
	
	/**
	 * Calculates and returns this Circle's circumference
	 * @return the circumference of this Circle
	 */
	public double circumference() {
		return 2.0 * this.radius * pi;
	}
	
	/**
	 * Two circles are equal if they have the same radius
	 * and the same center point location.
	 * @param c2 The circle we are checking for equality.
	 * @return True if the circles are equal; false, otherwise.
	 */
	public boolean equals(Circle c2) {
		if (
			(this.location.equals(c2.getLocation())) &&
			(this.radius == c2.getRadius())
		) {
			return true;
		}
		return false;
	}

	@Override
	// Do not change this.  Keep as is.
	public String toString() {
		return "Circle [radius=" + radius + ", Center: " + location + "]";
	}
	
	
}
