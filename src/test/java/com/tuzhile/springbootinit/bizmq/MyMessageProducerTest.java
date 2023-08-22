package com.tuzhile.springbootinit.bizmq;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyMessageProducerTest {

    @Resource
    private MyMessageProducer myMessageProducer;
    @Test
    void send() {
        myMessageProducer.send("code_exchange","my_routingKey","你好呀");
    }
}