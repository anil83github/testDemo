package com.test.testDemo;

public class TestBean {
    private String helloStr;

    public TestBean(String helloStr) {
        this.helloStr = helloStr;
    }

    public TestBean() {
    }

    public String getHelloStr() {
        return helloStr;
    }

    public void setHelloStr(String helloStr) {
        this.helloStr = helloStr;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "helloStr='" + helloStr + '\'' +
                '}';
    }
}
