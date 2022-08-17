package com.smy.springboot2204;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest(properties = "spring.main.web-application-type=reactive")
class Springboot2204ApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Autowired
//    private HelloWorldController helloWorldController;
//
//    @Test
//    public void test(){
//        String hello= helloWorldController.hello();
//        log.info(hello);
//        System.out.println(hello);
//    }


}
