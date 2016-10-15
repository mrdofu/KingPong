package com.example.kingpong;

import android.graphics.drawable.Drawable;

/**
 * Object representing person found in search fragment.
 */
public class BoardItem {
    public final int id;
    public final String firstName;
    public final String lastName;
    public final Drawable avatar;
    public final int score;

    public BoardItem(int id, String firstName, String lastName, Drawable avatar, int score) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
        this.score = score;
    }

}
