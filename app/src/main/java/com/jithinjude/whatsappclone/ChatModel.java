package com.jithinjude.whatsappclone;

/**
 * Created by <Jithin/Jude> on 22,August,2019.
 * jithin.jude68@gmail.com
 */
public class ChatModel {
    String name;
    String message;
    String time;
    String imgUrl;

    public ChatModel(String name, String message, String time, String imgUrl) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
