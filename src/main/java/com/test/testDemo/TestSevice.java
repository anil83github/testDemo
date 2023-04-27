package com.test.testDemo;

import org.springframework.stereotype.Component;

@Component
public class TestSevice {

    public TestBean getResponse(){
        TestBean testBean1 = new TestBean();
        testBean1.setHelloStr("This is hello test");
        return testBean1;
    }

}
