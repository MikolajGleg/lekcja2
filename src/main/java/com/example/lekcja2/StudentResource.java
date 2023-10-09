package com.example.lekcja2;

import com.example.lekcja2.data.Student;
import com.example.lekcja2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/students")
@RequiredArgsConstructor
public class StudentResource {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudents(@RequestBody Student student){
        studentService.saveStudent(student);
    }

  //  @GetMapping(path = "/{id}")
   // public Student getStudentById(@PathVariable UUID id){
        //return studentService.getStudentById(id);
      //  return new Student(1f093afc-66b8-11ee-8730-325096b39f47,"g");
 //   }
}
