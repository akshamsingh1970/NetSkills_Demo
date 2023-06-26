package com.sivasai.restProject.CrudPractice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name = "city")
    private String city;
}
