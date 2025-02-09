package es.uah.matcomp.mp.e1.ejerciciosclases.e2;

/**
 * The Rectangles class models a rectangle with length and width.
 */
public class Rectangle {// Save as "Rectangle.java"
    // private instance variable, not accessible from outside this class
    private float length;
    private float width;

    /** Constructs a Rectangle instance with default value for length 1.0f */
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }
    /** Constructs a Rectangle instance with the given length and width */
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    /** Returns the length */
    public float getLength() {
        return length;
    }
    /** Setter for length */
    public void setLength(float length) {
        this.length = length;
    }
    /** Returns the width */
    public float getWidth() {
        return width;
    }
    /** Setter for width */
    public void setWidth(float width) {
        this.width = width;
    }
    /** Returns the area of this Rectangle instance */
    public double getArea() {
        return length * width;
    }
    /** Returns the Perimeter of this Rectangle instance */
    public double getPerimeter() {
        return 2 *length + 2 * width;
    }
    /** Override toString() method */
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
