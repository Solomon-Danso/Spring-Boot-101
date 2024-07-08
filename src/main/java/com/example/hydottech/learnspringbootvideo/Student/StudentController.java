package com.example.hydottech.learnspringbootvideo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {


    @GetMapping("/getStudents")
    public List<Student> getStudents(){

        return List.of(
                new Student(
                        1L,
                        "Solomon Danso",
                        30,
                        LocalDate.of(1999, Month.DECEMBER, 31),
                        "solomondanso@gmail.com"

                ),
                new Student(
                        2L,
                        "Isaac Frimpong",
                        20,
                        LocalDate.of(2012, Month.DECEMBER, 31),
                        "isaacfrimpong@gmail.com"

                )

        );
    }







}
