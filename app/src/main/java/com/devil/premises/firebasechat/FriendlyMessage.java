package com.devil.premises.firebasechat;

public class FriendlyMessage {
    private String text;
    private String name;
    private String photoUrl;

    public FriendlyMessage(){
    }

    public FriendlyMessage(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }
}
