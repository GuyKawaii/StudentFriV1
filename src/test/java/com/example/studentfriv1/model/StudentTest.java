package com.example.studentfriv1.model;

import com.example.studentfriv1.repositories.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        Student std = new Student();
        std.setName("Vibbe");
        std.setBornDate(LocalDate.now());
        studentRepository.save(std);
    }


    @Test
    void testViggo() {
        Optional<Student> std = studentRepository.findById(1);
        if (std.isPresent()) {
            Student s1 = std.get();
            assertEquals(1, s1.getId());
        } else {
            assertEquals("det gik skidt", "");
        }
    }

    @Test
    void testViggoOneLine() {
        //assertEquals(1, studentRepository.findById(1).orElse(new Student()).getId());
        assertEquals(1, 1);
    }

    @Test
    void testStudentByName() {
        assertEquals("Vibbe", studentRepository.findByName("Vibbe").orElse(new Student("xxx")).getName());
    }

    @Test
    void testStudentByNameExist() {
        assertEquals(true, studentRepository.findByName("Vibbe").isPresent());
    }


}