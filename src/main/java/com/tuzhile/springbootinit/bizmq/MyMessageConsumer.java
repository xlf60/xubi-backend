package com.tuzhile.springbootinit.bizmq;

import com.rabbitmq.client.Channel;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;


/**
 * @author xulongfei
 * @date 2023/8/22 15:03
 */
@Component
@Slf4j
public class MyMessageConsumer {

    /**
     * 指定程序监听的消息队列和确认机制
     * <p>
     * RECORD: 记录所有的消息，如果消费者崩溃或者没有处理消息，消息会被重新发送到队列中。
     * REPEATED: 消息会被重复发送到队列中，直到消费者成功处理消息或者达到重复发送的次数。
     * IMMEDIATE: 消息会被立即发送到队列中，如果消费者没有处理消息，则会抛出异常。
     * MANUAL: 消息接收后需要手动确认，否则消息会一直留在队列中。
     */
    @SneakyThrows
    @RabbitListener(queues = {"code_queue"}, ackMode = "MANUAL")
    public void receiveMessage(String message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) {
        log.info("receiveMessage = {}", message);
        channel.basicAck(deliveryTag, false);
    }
}
