package com.baosight.wxscreen;

import com.baosight.wxscreen.pojo.Message;
import com.baosight.wxscreen.pojo.MessageContent;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GeekSeeker on 1/4/16.
 */
@Controller
@RequestMapping(value = "/wall")
public class WallController {
    /*    @RequestMapping(value = "/api/message/sync", produces = "text/json;charset=UTF-8", method = RequestMethod.POST)
        public ModelAndView message(@RequestParam(value = "last_id", required = false) String last_id,
                                    @RequestParam(value = "tag_id", required = false) String tag_id,
                                    @RequestParam(value = "state") String state) {
            ModelAndView modelAndView = new ModelAndView("message");
            if ("144192289918982554".equals(last_id)) {
                modelAndView = new ModelAndView("messageEmpty");

            }
            if ("app".equals(state)) {
                modelAndView = new ModelAndView("message");
            }
            return modelAndView;
        }*/
    @ResponseBody
    @RequestMapping(value = "/api/message/sync", method = RequestMethod.POST)
    public Message message(@RequestParam(value = "last_id", required = false) String last_id,
                           @RequestParam(value = "tag_id", required = false) String tag_id,
                           @RequestParam(value = "state") String state) {
//                "id": "5351110",
//                "mp_message_id": "0",
//                "company_id": "101039",
//                "user_id": "1353510",
//                "msg_type": "text",
//                "content": "\u5458\u5de5\u793e\u533a\u652f\u6301\u5fae\u4fe1\u5927\u5c4f\u5e55\u5566",
//                "photo": "",
//                "is_on_wall": "1",
//                "is_presenter": "0",
//                "update_time_ms": "144192289918901254",
//                "on_wall_time": "2015-05-02 21:47:04",
//                "mp_add_time": "2015-05-02 21:47:04",
//                "message_from": "weixin",
//                "is_back_show": "1",
//                "add_time": "2015-05-02 21:47:04",
//                "avatar": "http:\/\/i.baosight.com\/bbs\/uc_server\/data\/avatar\/000\/00\/33\/99_avatar_middle.jpg",
//                "username": "\u8fbe\u65af\u7279\u5170\u65af",
//                "come_from": "\u4e0a\u6d77 \u4e0a\u6d77\u5e02"
        MessageContent messageContent = new MessageContent();
        messageContent.setUsername("达斯特兰斯");
        messageContent.setCome_from("美国");
        messageContent.setContent("我知道这个是重复的");
        messageContent.setId(String.valueOf(5369344));
        messageContent.setMp_message_id(String.valueOf(0));
        messageContent.setCompany_id(String.valueOf(101039));
        messageContent.setUser_id(String.valueOf(1359390));
        messageContent.setMsg_type("text");
        messageContent.setAvatar("http://wx.qlogo.cn/mmopen/Q3auHgzwzM4hwePzcLkroH37AmGibxMRGdrWo6a7L850KzPFe9DUibnocGkOrmO47bjurbgB4EibZx4kO1GKxI50w/0");
        messageContent.setOn_wall_time("2015-05-04 22:20:36");
        messageContent.setIs_back_show(String.valueOf(1));
        messageContent.setAdd_time("2015-05-04 22:20:36");
        messageContent.setMessage_from("weixin");
        messageContent.setUpdate_time_ms("144192289918947064");

        List<MessageContent> messageContents = new ArrayList<MessageContent>();
        messageContents.add(messageContent);

        Message message = new Message();
        message.setMessage_list(messageContents);
        message.setInfo("ok");
        message.setAll_total(String.valueOf(messageContents.size()));
        return message;
    }

    @RequestMapping(value = "/api/user/sync", produces = "text/json;charset=UTF-8", method = RequestMethod.POST)
    public ModelAndView user(@RequestParam(value = "state") String state,
                             @RequestParam(value = "last_id", required = false) String last_id,
                             @RequestParam(value = "last_whitelist_id", required = false) String last_whitelist_id) {
        ModelAndView modelAndView = new ModelAndView("sync");
        if ("message".equals(state)) {
            if ("144192289919006300".equals(last_id)) {
                modelAndView = new ModelAndView("sync2");
            }
        }
        if ("app".equals(state)) {
            if ("144192289919006300".equals(last_id)) {
                modelAndView = new ModelAndView("sync2");
            }
        }
        if ("lottery".equals(state)) {
            modelAndView = new ModelAndView("lottery");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/api/user/notice/get_latest_notice", produces = "text/json;charset=UTF-8", method = RequestMethod.POST)
    public ModelAndView message() {
        ModelAndView modelAndView = new ModelAndView("notice");
        return modelAndView;
    }
}
