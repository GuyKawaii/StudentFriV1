package com.example.studentfriv1.repositories;

import com.example.studentfriv1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByName(String name);


}
