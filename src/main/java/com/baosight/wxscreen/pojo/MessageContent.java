package com.baosight.wxscreen.pojo;

import com.baosight.wxscreen.databind.JavaScriptEscapeDeserializer;
import com.baosight.wxscreen.databind.JavaScriptEscapeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by GeekSeeker on 1/4/16.
 */
public class MessageContent {
    private String id;
    private String mp_message_id;
    private String company_id;
    private String user_id;
    private String msg_type;
    @JsonSerialize(using= JavaScriptEscapeSerializer.class)
    @JsonDeserialize(using = JavaScriptEscapeDeserializer.class)
    private String content;
    private String photo;
    private String is_on_wall;
    private String is_presenter;
    private String update_time_ms;
    private String on_wall_time;
    private String mp_add_time;
    private String message_from;
    private String is_back_show;
    private String add_time;
    private String avatar;
    @JsonSerialize(using= JavaScriptEscapeSerializer.class)
    @JsonDeserialize(using = JavaScriptEscapeDeserializer.class)
    private String username;
    @JsonSerialize(using= JavaScriptEscapeSerializer.class)
    @JsonDeserialize(using = JavaScriptEscapeDeserializer.class)
    private String come_from;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMp_message_id() {
        return mp_message_id;
    }

    public void setMp_message_id(String mp_message_id) {
        this.mp_message_id = mp_message_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getIs_on_wall() {
        return is_on_wall;
    }

    public void setIs_on_wall(String is_on_wall) {
        this.is_on_wall = is_on_wall;
    }

    public String getIs_presenter() {
        return is_presenter;
    }

    public void setIs_presenter(String is_presenter) {
        this.is_presenter = is_presenter;
    }

    public String getUpdate_time_ms() {
        return update_time_ms;
    }

    public void setUpdate_time_ms(String update_time_ms) {
        this.update_time_ms = update_time_ms;
    }

    public String getOn_wall_time() {
        return on_wall_time;
    }

    public void setOn_wall_time(String on_wall_time) {
        this.on_wall_time = on_wall_time;
    }

    public String getMp_add_time() {
        return mp_add_time;
    }

    public void setMp_add_time(String mp_add_time) {
        this.mp_add_time = mp_add_time;
    }

    public String getMessage_from() {
        return message_from;
    }

    public void setMessage_from(String message_from) {
        this.message_from = message_from;
    }

    public String getIs_back_show() {
        return is_back_show;
    }

    public void setIs_back_show(String is_back_show) {
        this.is_back_show = is_back_show;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCome_from() {
        return come_from;
    }

    public void setCome_from(String come_from) {
        this.come_from = come_from;
    }
}
