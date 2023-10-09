package com.example.lekcja2.service;

import com.example.lekcja2.data.Student;
import com.example.lekcja2.data.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.saveStudent(student);
    }
}