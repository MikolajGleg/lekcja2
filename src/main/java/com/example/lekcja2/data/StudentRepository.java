package com.example.lekcja2.data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public void saveStudent(Student student){
        students.add(student);
    }

    public void getStudentById(UUID id){
        return students.stream()
                .filter(it -> it.id().equals(id))
        .findFirst()
                .orElse();
    }
}