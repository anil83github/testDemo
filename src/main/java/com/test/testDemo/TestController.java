package com.test.testDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private final TestSevice testSevice;

    public TestController(TestSevice testSevice) {
        this.testSevice = testSevice;
    }

    @GetMapping("/test")
    public TestBean getResponse(){
        return testSevice.getResponse();
    }

}
