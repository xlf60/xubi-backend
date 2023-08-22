package com.tuzhile.springbootinit.bizmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author xulongfei
 * @date 2023/8/22 14:56
 */
@Component
public class MyMessageProducer {

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void send(String exchange, String routingKey, String message) {
        rabbitTemplate.convertSendAndReceive(exchange, routingKey, message);
    }
}
