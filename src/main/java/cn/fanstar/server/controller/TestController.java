package cn.fanstar.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanjun on 2018/2/25.
 */
@RestController
@RequestMapping("/api/")
public class TestController {


    @GetMapping("/hello")
    public String hello(){

        return "greeting from server-demo";
    }

}
