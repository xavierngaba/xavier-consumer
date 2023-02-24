package com.udemy.xavier.consumer.consumer;

import com.udemy.xavier.consumer.json.Student;

public interface IConsumer {

    void consumeMessage(Student student);
}
