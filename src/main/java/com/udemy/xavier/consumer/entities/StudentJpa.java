package com.udemy.xavier.consumer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ETUDIANT")
public class StudentJpa implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private String prenom;

    private int age;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReception;
}
