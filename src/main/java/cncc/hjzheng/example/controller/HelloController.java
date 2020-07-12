package cncc.hjzheng.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** @author: hjzheng818@126.com */

@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "index";
    }
    /*the is a test for github*/

}
