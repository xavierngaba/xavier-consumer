package com.udemy.xavier.consumer.repositories;

import com.udemy.xavier.consumer.entities.StudentJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<StudentJpa, Long> {
}
