package com.shl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/getPage")
    public ModelAndView getPage(@RequestParam("pageId") String pageId) {
        System.out.println("Page requested for : " + pageId);
        ModelAndView mav = new ModelAndView(pageId);
        return mav;
    }

    @RequestMapping("/")
    public ModelAndView new_admin() {
        ModelAndView mav = new ModelAndView("newAdmin");

        return mav;
    }
}
