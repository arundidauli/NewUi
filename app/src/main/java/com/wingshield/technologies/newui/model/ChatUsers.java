package com.wingshield.technologies.newui.model;

/**
 * Created by Arun Kumar on 26/8/20.
 * Copyright (c) 2020  wingshieldtechnologies.com All rights reserved.
 */

/*@IgnoreExtraProperties
@Keep*/
public class ChatUsers {
    String id;
    String sender_id;
    String receiver_id;
    String user_name;
    String last_message;
    String status;
    String count_unread_message;
    String profile_pic;
    String message_time;
    String user_type;
    String user_blocked_status;
    String user_token_id;


    public ChatUsers() {

    }

    public ChatUsers(String user_name, String last_message, String count_unread_message, String profile_pic) {
        this.user_name = user_name;
        this.last_message = last_message;
        this.count_unread_message = count_unread_message;
        this.profile_pic = profile_pic;
    }

    public String getUser_blocked_status() {
        return user_blocked_status;
    }

    public void setUser_blocked_status(String user_blocked_status) {
        this.user_blocked_status = user_blocked_status;
    }

    public String getUser_token_id() {
        return user_token_id;
    }

    public void setUser_token_id(String user_token_id) {
        this.user_token_id = user_token_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(String receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getLast_message() {
        return last_message;
    }

    public void setLast_message(String last_message) {
        this.last_message = last_message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount_unread_message() {
        return count_unread_message;
    }

    public void setCount_unread_message(String count_unread_message) {
        this.count_unread_message = count_unread_message;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getMessage_time() {
        return message_time;
    }

    public void setMessage_time(String message_time) {
        this.message_time = message_time;
    }
}
