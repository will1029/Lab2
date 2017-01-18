package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by thoang on 1/17/17.
 * Lab2
 */

public abstract class Mood {
    private Date date;

    //Default (Current date and time)
    public Mood() {
        this.date = new Date();
    }

    //Constructor with date as argument
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String moodFormat();
}
