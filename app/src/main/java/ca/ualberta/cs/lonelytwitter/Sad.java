package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by thoang on 1/17/17.
 */

public class Sad extends Mood {
    public Sad() {
    }

    public Sad(Date date) {
        super(date);
    }

    public String moodFormat() {
        return "Sad :(";
    }
}
