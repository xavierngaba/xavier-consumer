package com.udemy.xavier.consumer.consumer.impl;

import com.udemy.xavier.consumer.consumer.IConsumer;
import com.udemy.xavier.consumer.entities.StudentJpa;
import com.udemy.xavier.consumer.json.Student;
import com.udemy.xavier.consumer.repositories.EtudiantRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Consumer implements IConsumer {

    @Autowired
    private EtudiantRepository repository;
    @Override
    @RabbitListener(queues = "${udemy.rabbitmq.queue}")
    public void consumeMessage(Student student) {
        StudentJpa etudiant = StudentJpa.builder().nom(student.getNom()).prenom(student.getPrenom()).age(student.getAge()).dateReception(new Date()).build();
        repository.save(etudiant);
        System.out.println("Received message = " + student.toString() );
    }
}
