package com.yankie.learn.consumer.web;

import com.yankie.learn.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@RestController("demoController")
@RequestMapping(value = "/demo")
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(String name) {
        return demoService.sayHello(name);
    }
}
