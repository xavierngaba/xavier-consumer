package com.udemy.xavier.consumer.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student implements Serializable {
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("prenom")
    private String prenom;
    @JsonProperty("age")
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }
}
