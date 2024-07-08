package com.example.hydottech.learnspringbootvideo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return  studentService.getStudents();
    }


    @PostMapping("/addStudent")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);

    }

    @DeleteMapping("/removeStudent")
    public void removeStudent(@RequestBody Student student){

        studentService.removeStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestBody Student student){

        studentService.deleteStudent(student);
    }

@PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
}




}
