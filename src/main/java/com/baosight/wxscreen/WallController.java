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
    public ModelAndView message(@RequestParam(value = "last_id") String last_id, @RequestParam(value = "tag_id") String tag_id, @RequestParam(value = "state") String state) {
        ModelAndView modelAndView = new ModelAndView("message");
        if ("144192289918982554".equals(last_id)) {
            modelAndView = new ModelAndView("view/messageEmpty.vm");

        }
        if ("app".equals(state)) {
            modelAndView = new ModelAndView("view/message.vm");
        }
        return modelAndView;
    }
}
