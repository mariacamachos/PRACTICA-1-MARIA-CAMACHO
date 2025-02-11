package es.uah.matcomp.mp.e1.ejerciciosclases.e7;
/**
 * The Time class models a specific time of the day with hour, minute, and second
 */
public class Time { // Save as "Date.java"
    // private instance variable, not accessible from outside this class
    private int hour;
    private int minute;
    private int second;

    /**
     * Constructs a Time instance with the specified hour, minute, and second.
     */
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Returns the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Returns the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Returns the second
     */
    public int getSecond() {
        return second;
    }

    /**
     * Setter for hour
     */
    public void setHour(int hour) {
        if (hour >= 0 & hour < 24) {
            this.hour = hour;
        }
    }
    /**
    * Setter for minute
    */
    public void setMinute(int minute) {
        if (minute >= 0 & minute < 60) {
            this.minute = minute;
        }
    }

    /**
     * Setter for second
     */
    public void setSecond(int second) {
        if (second >= 0 & second < 60) {
            this.second = second;
        }
    }

    /**
     * Sets the time with the given hour, minute, and second.
     */
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Returns the time as a formatted string (hh:mm:ss).
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    /**
     * Advances the time by one second.
     * If the second reaches 60, it resets to 0 and increments the minute.
     * If the minute reaches 60, it resets to 0 and increments the hour.
     * If the hour reaches 24, it resets to 0.
     */
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }

    /**
     * Moves the time back by one second.
     * If the second reaches -1, it resets to 59 and decrements the minute.
     * If the minute reaches -1, it resets to 59 and decrements the hour.
     * If the hour reaches -1, it resets to 23.
     */
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour <0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

}
