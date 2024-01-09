package com.ms.emailms.consumers;

import com.ms.emailms.dtos.EmailDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.emailms.name}")
    public void listenEmailQueue(@Payload EmailDTO emailDTO){
        System.out.println(emailDTO.emailTo());
    }
}
