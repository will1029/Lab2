package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by thoang on 1/17/17.
 */

public class Happy extends Mood {
    public Happy() {
    }

    public Happy(Date date) {
        super(date);
    }

    public String moodFormat() {
        return "Happy :)";
    }
}
