package com.example.hydottech.learnspringbootvideo.Student;

import java.time.LocalDate;

public class Student {


    private Long Id;
    private String Name;
    private Integer Age;
    private LocalDate DOB;
    private String Email;

    public Student(Long id, String name, Integer age, LocalDate DOB, String email) {
        Id = id;
        Name = name;
        Age = age;
        this.DOB = DOB;
        Email = email;
    }


    public Student(String name, Integer age, LocalDate DOB, String email) {
        Name = name;
        Age = age;
        this.DOB = DOB;
        Email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", DOB=" + DOB +
                ", Email='" + Email + '\'' +
                '}';
    }









}
