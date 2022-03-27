package com.cicd.integrationtesting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {
    HelloController helloController = new HelloController();

    @Test
    void testIndex(){
        Assert.assertEquals("Greetings from Spring Boot!", helloController.index());
    }

    @Test
    void testCheck() {
        Assert.assertEquals("Check pass", helloController.check());
    }

    @Test
    void testSum(){
        int a=10;
        int b=20;
        Assert.assertEquals(30, helloController.sum(a, b));
    }
}
