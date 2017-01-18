package ca.ualberta.cs.lonelytwitter;

/**
 * Created by thoang on 1/17/17.
 * Created for Lab Edits
 */

public class TweetTooLongException extends Exception {
    public TweetTooLongException() {
    }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
