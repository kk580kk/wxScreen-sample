package com.baosight.wxscreen.pojo;

import java.util.List;

/**
 * Created by GeekSeeker on 1/4/16.
 */
public class Message {
    private String info;
    private List off_wall_ids;
    private String all_total;
    private Boolean s_main_screen;
    private String state;
    private List<MessageContent> message_list;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List getOff_wall_ids() {
        return off_wall_ids;
    }

    public void setOff_wall_ids(List off_wall_ids) {
        this.off_wall_ids = off_wall_ids;
    }

    public String getAll_total() {
        return all_total;
    }

    public void setAll_total(String all_total) {
        this.all_total = all_total;
    }

    public Boolean getS_main_screen() {
        return s_main_screen;
    }

    public void setS_main_screen(Boolean s_main_screen) {
        this.s_main_screen = s_main_screen;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<MessageContent> getMessage_list() {
        return message_list;
    }

    public void setMessage_list(List<MessageContent> message_list) {
        this.message_list = message_list;
    }
}
