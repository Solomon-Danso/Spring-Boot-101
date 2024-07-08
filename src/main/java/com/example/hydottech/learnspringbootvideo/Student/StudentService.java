package com.example.hydottech.learnspringbootvideo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){

        return studentRepository.findAll();
    }


    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email taken");
        }

        studentRepository.save(student);
    }


    public void removeStudent(Student student) {

        Optional<Student> studentOptional = studentRepository.findById( student.getId() );

        if ( studentOptional.isPresent() && studentOptional.get().getEmail().equals( student.getEmail() ) ) {
            studentRepository.delete( studentOptional.get() );
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to delete");
        }
    }



    public void deleteStudent(Student student) {
        boolean exists = studentRepository.existsByEmail(student.getEmail());
        if (!exists) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student does not exist");
        }
        studentRepository.deleteByEmail(student.getEmail());
        throw new ResponseStatusException(HttpStatus.OK, "Student DELETED Successfully");
    }

    public void updateStudent(Student student) {
        Optional<Student> existingStudentOptional = studentRepository.findStudentByEmail(student.getEmail());

        if (!existingStudentOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student does not exist");
        }

        Student existingStudent = existingStudentOptional.get();

        // Update fields only if they are not null in the incoming student object
        if (student.getName() != null) {
            existingStudent.setName(student.getName());
        }
        if (student.getAge() != null) {
            existingStudent.setAge(student.getAge());
        }
        if (student.getDob() != null) {
            existingStudent.setDob(student.getDob());
        }
        // Add more fields as needed

        studentRepository.save(existingStudent);
        throw new ResponseStatusException(HttpStatus.OK, existingStudent.getName()+" updated Successfully");
    }






}
