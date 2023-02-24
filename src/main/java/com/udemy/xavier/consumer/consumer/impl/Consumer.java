package com.udemy.xavier.consumer.consumer.impl;

import com.udemy.xavier.consumer.consumer.IConsumer;
import com.udemy.xavier.consumer.json.Student;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements IConsumer {
    @Override
    @RabbitListener(queues = "${udemy.rabbitmq.queue}")
    public void consumeMessage(Student student) {
        System.out.println("Received message = " + student.toString() );
    }
}
