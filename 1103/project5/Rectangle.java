package project5;

/**
 * A program to declare a rectangle in 2D space with a Point origin, a width, and a length.
 * @author Ethan Peterson
 *
 */

public class Rectangle extends Closed implements FiguresInterface {
	
	// A rectangle has a length and a width.  
	public int length;
	public int width;
	
	/**
	 * Constructor that sets the lower left corner to
	 * the x and y value and sets the length and width
	 * of this rectangle.
	 * @param x The x coordinate of the lower left corner
	 * @param y The y coordinate of the lower left corner
	 * @param length Length of the rectangle
	 * @param width Width of the rectangle
	 */
	public Rectangle(int x, int y, int length, int width){
		super(x,y);
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Returns this Rectangle's length.
	 * @return length value of this Rectangle
	 */
	public int getLength() {
		return this.length;
	}

	/**
	 * Sets this Rectangle's length to a given value.
	 * @param length value to set for length
	 */ 
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * Returns this Rectangle's width.
	 * @return width value of this Rectangle
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Sets this Rectangle's width to a given value.
	 * @param width value to set for width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Calculates the perimeter of the rectangle.
	 * @return Perimeter of the rectangle.
	 */
	public int perimeter() {
		return (this.width * 2) + (this.length * 2);
	}
	
	/**
	 * Calculates the area of the rectangle.
	 * @return Area of the rectangle.
	 */
	public int area() {
		return this.length * this.width;
	}
	
	/**
	 * Increases the size of the rectangle by the percentage
	 * indicated by the input parameter.  e.g. 20 would
	 * increase the length by 20% AND would increase 
	 * the width by 20%
	 * 
	 * @param percent The percentage to increase by.
	 */ 
	public void enlargeSize(int percent) {
		this.length += (int)(this.length * .01 * percent);
		this.width += (int)(this.width * .01 * percent);
		
	}
	
	/**
	 * Returns the Point correspoinding to this Rectangle's upper right corner
	 * @return Upper right point of the rectangle
	 */
	public Point getRightUpper(){

		Point upperRightPoint = new Point();
		upperRightPoint.setX(location.getX() + this.length);
		upperRightPoint.setY(location.getY() + this.width);
		return upperRightPoint;
	}
	
	/**
	 * Returns the Point correspoinding to this Rectangle's upper left corner
	 * @return Upper left point of the rectangle
	 */
	public Point getLeftUpper(){
		Point upperLeftPoint = new Point();
		upperLeftPoint.setX(location.getX());
		upperLeftPoint.setY(location.getY() + this.width);
		return upperLeftPoint;
	}
	
	/**
	 * A rectangle equals another rectangle if the corners of the rectangles are equal.
	 * @param r Rectangle to checked to see if contained in this rectangle.
	 * @return true if r is in this rectangle; false otherwise
	 */
	public boolean equals(Rectangle r) {
		if (
			(this.location.equals(r.getLocation())) &&
			(this.width == r.getWidth()) &&
			(this.length == r.getLength())
		) {
			return true;
		}
		return false;
	}
	
	/**
	 * Calculates the right lower corner of the rectangle.
	 * @return  Point of the right lower corner.
	 */
	public Point getRightLower(){
		return new Point(location.getX() + length, location.getY());
	}
	
	
	/**
	 * If the Point pt is in the rectangle's space (can be on the perimeter), return true;
	 * @param pt The point we are checking to see if it is in the Rectangle's space.
	 * @return true if in the rectangle or on the perimeter; false, otherwise
	 */
	public boolean inside(Point pt) {
		if (
			(pt.getX() >= location.getX()) &&
			(pt.getY() >= location.getY()) &&
			(pt.getX() <= this.getRightUpper().getX()) &&
			(pt.getY() <= this.getRightUpper().getY())
		) {
			return true;
		}
		return false;				
	}

	@Override
	// No changes needed for this method.  Keep as is.
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", Left Bottom Corner: " + location + "]";
	}
			
}


