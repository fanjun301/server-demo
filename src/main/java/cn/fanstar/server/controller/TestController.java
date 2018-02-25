package cn.fanstar.server.controller;

import cn.fanstar.server.ServerDemoApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanjun on 2018/2/25.
 */
@RestController
@RequestMapping("/api/")
public class TestController {

    @Autowired
    private ServerDemoApplicationConfig serverDemoApplicationConfig;


    @GetMapping("/hello")
    public String hello(){

        return "greeting from server-demo";
    }

    @GetMapping("/token")
    public String token(){

        return String.format(" token is : %s", serverDemoApplicationConfig.getSecretToken() );
    }

}
