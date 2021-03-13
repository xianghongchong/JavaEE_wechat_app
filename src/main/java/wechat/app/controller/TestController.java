package wechat.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wechat.app.model.Test;
import wechat.app.model.Test1;
import wechat.app.service.TestService;

import java.util.List;

@RestController
@RequestMapping("Test")
public class TestController {
    @Autowired
     TestService testService;
    @RequestMapping("test1")
    public List<Test> test(@RequestBody Test1 test)
    {
        System.out.println(test.toString());
        List<Test> a = testService.Select();
        System.out.println(a.toString());


        return a;

        
    }
}
