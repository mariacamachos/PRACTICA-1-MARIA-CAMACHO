package es.uah.matcomp.mp.e1.ejerciciosclases.e8;
/**
 * The Ball class models a ball with x,y,radius, delta(x,).
 */
    public class Ball {// Save as "Ball.java"
    // private instance variable, not accessible from outside this class
    private float x;
    private float y;
    private float radius;
    private float xDelta;
    private float yDelta;

    /** Constructs a Ball instance */
    public Ball(float x, float y, float radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    /** Returns the x */
    public float getX() {
        return x;
    }
    /** Setter for y */
    public void setX(float x) {
        this.x = x;
    }
    /** Returns the length */
    public float getY() {
        return y;
    }
    /** Setters for y */
    public void setY(float y) {
        this.y = y;
    }
    /**Returns the radius*/
    public int getRadius(){
        return (int)radius;
    }
    /** Setters for radius */
    public void setRadius(int radius){
        this.radius = radius;
    }
    /**Returns the xDelta*/
    public float getXDelta() {
        return xDelta;
    }
    /**Setter for xDelta*/
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    /**Returns for yDelta*/
    public float getYDelta() {
        return yDelta;
    }
    /**Setter for yDelta*/
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    /** Delta is added to x/y in each variable*/
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    /** Establishes the equivalences between the horizontal coordinate axes */
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    /** Establishes the equivalences between the vertical coordinate axes */
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    /** Override toString() method */
    /** Returns the dimension of the ball and the speed*/
    @Override
    public String toString() {
        return "Ball [(" + x +"," + y +")" + "speed=(" + xDelta + "," + yDelta + ")]";
    }
}

