package es.uah.matcomp.mp.e1.ejerciciosclases.e6;

/**
 * The Date class models a date with a day, month and year.
 */
public class Date {// Save as "Date.java"
    // private instance variable, not accessible from outside this class
    private int day;
    private int month;
    private int year;

    /** Constructs a Date instance with day, month and year */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    /** Returns the day */
    public int getDay() {
        return day;
    }
    /** Returns the month */
    public int getMonth (){
        return month;
    }
    /** Returns the year */
    public int getYear(){
        return year;
    }
    /** Setter for day */
    public void setDay(int day) {
        this.day = day;
    }
    /** Setter for month */
    public void setMonth(int month) {
        this.month = month;
    }
    /** Setter for year */
    public void setYear(int year) {
        this.year = year;
    }
    /** Setter for day, month and year */
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    /** Override toString() method */
    @Override
    public String toString() {
        return  String.format("%02d/%02d/%04d", day, month, year);
    }
}
