package com.example.myapplication.Helpers;

public class TakeInfo {
    protected String user;
    protected String message;

    public TakeInfo(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }





}
