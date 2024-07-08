package com.example.hydottech.learnspringbootvideo.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);

    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Student s WHERE s.email = :email")
    boolean existsByEmail(@Param("email") String email);

    @Modifying
    @Transactional
    @Query("DELETE FROM Student s WHERE s.email = :email")
    void deleteByEmail(@Param("email") String email);

}
