package lab9;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int compArea() {
        return this.length * this.width;
    }

    public int compPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    public Rectangle addRectangle(Rectangle r2) {
        Rectangle retRect = new Rectangle();
        retRect.setWidth(this.width + r2.getWidth());
        retRect.setLength(this.length + r2.getLength());

        return retRect;
    }

    public Rectangle addRectangle(Rectangle r1, Rectangle r2) {
        Rectangle retRect = new Rectangle();
        retRect.setWidth(r1.getWidth() + r2.getWidth());
        retRect.setLength(r1.getLength() + r2.getLength());
        
        return retRect;
    }

    public Rectangle deleteRectangle(Rectangle r2) {
        Rectangle retRect = new Rectangle();
        retRect.setWidth(this.width - r2.getWidth());
        retRect.setLength(this.length - r2.getLength());

        return retRect;
    }

    public String toString() {
        return String.format("Rectangle: width: %d, length: %d", this.width, this.length);
    }

}
