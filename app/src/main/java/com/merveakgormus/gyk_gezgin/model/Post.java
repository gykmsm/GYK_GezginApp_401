package com.merveakgormus.gyk_gezgin.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Post {
    private int picture;
    private String title;
    private String content;
    private String time;

    public Post(int picture, String title, String content, String time) {
        this.picture = picture;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getTimeCalculater(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm",Locale.US);
        try {
            return simpleDateFormat.parse(getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Date();

    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
