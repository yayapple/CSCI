package project5;

/**
 * A program to declare a point with integer coordinates in 2D space.
 * @author Ethan Peterson
 *
 */

public class Point {
	
	// A point is a position in the x-y coordinate system.
	private int x;
	private int y;
	
	/**
	 * Default constructor sets x and y to 0.
	 */
	public Point() {
		super();
		x = 0;
		y = 0;
	}

	/**
	 * 
	 * @param x x-coordinate of a point in 2D space
	 * @param y y-coordinate of a point in 2D space
	 */
	// Set this point's x and y values to the input parameters.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns this Point's x value.
	 * @return x value of this point
	 */

	public int getX() {
		return this.x;
	}

	/**
	 * Sets this Point's x to a given value.
	 * @param x value to set for x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Returns this Point's y value.
	 * @return y value of this point
	 */
	
	public int getY() {
		return this.y;
	}

	/**
	 * Sets this Point's y to a given value.
	 * @param y value to set for y
	 */

	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Determines if two points are equal to one another.
	 * If the x values are the equal and the y values are
	 * equal, then the two points are equal.
	 * @param p Point to compare
	 * @return equality of the two Points
	 */
	public boolean equals(Point p) {
		if ((this.x == p.getX()) && (this.y == p.getY())) {
			return true;
		}
		return false;	
	}

	@Override
	// This is a complete method.  No changes necessary.
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
