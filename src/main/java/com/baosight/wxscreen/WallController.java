package com.baosight.wxscreen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by GeekSeeker on 1/4/16.
 */
@Controller
@RequestMapping(value = "/wall")
public class WallController {
    @RequestMapping(value = "/api/message/sync", produces = "text/json;charset=UTF-8", method = RequestMethod.POST)
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
