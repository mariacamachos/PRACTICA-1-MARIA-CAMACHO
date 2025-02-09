package es.uah.matcomp.mp.e1.ejerciciosclases.e1;
/**
 * The Circle class models a circle with a radius.
 */

public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;

    /** Constructs a Circle instance with default value for radius 1.0 */
    public Circle(){
        this.radius = 1.0;
    }
    /** Constructs a Circle instance with the given radius */
    public Circle(double radius){
        this.radius = radius;
    }
    /** Returns the radius */
    public double getRadius(){
        return radius;
    }
    /** Setter for radius */
    public void setRadius(double radius){
        this.radius = radius;
    }
    /** Returns the area of this Circle instance */
    public double getArea(){
        return Math.PI * radius * radius;
    }
    /** Returns the Circumference of this Circle instance */
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    /** Override toString() method */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " ]";
    }
}

