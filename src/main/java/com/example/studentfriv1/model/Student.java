package com.example.studentfriv1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private LocalDate bornDate;
    private LocalTime bornTime;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public LocalTime getBornTime() {
        return bornTime;
    }

    public void setBornTime(LocalTime bornTime) {
        this.bornTime = bornTime;
    }
}
