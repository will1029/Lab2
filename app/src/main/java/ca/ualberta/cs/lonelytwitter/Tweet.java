package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by thoang on 1/17/17.
 * Created for Lab edits
 */

// Abstract - Can't make a Tweet class, but can make sub-class
public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();   // Stores a list of all the moods

    // Add a mood to the list
    public void addMood(Mood mood) {
            this.moodList.add(mood);
    }

    // Remove a mood from the list
    public void removeMood(Mood mood) {
        this.moodList.remove(mood);
    }


    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();     //Current date and time
    }
}
