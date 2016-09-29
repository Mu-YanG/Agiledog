package org.dennis.agiledog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author deng.zhang
 * @since 1.0.0
 * Created on 2016-09-28 19:57
 */
@Controller
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
