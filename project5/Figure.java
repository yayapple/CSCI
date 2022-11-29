package project5;

/**
 * The abstract class Figure contains a Point that will be 
 * the location point of reference for our figures.  It will also 
 * contain one method that will move our location to a new 
 * Point's x and y value.  The second method will need to be
 * implemented by you in all classes that extend Figure.
 * 
 * @author YOUR NAMES GO HERE
 */
public abstract class Figure {
	
	protected Point location; 
	
	/**
	 * The moveTo method takes in a Point and sets the
	 * current object's x to the p's x value and p's y value.
	 * We do not want a reference pointing to the Point but
	 * rather a copy of the state variables, x and y.
	 * @param pnt Copy the x and y values to our location.
	 */
	void moveTo(Point pnt){
		location.setX(pnt.getX());
		location.setY(pnt.getY());
	}

	/**
	 * Moves the figure to the given coordinates.
	 * @param x x value to move to
	 * @param y y value to move to
	 */
	abstract void moveTo(int x, int y);
	
}
