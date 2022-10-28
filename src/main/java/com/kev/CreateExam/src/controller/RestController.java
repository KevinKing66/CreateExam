package com.kev.CreateExam.src.controller;

import com.kev.CreateExam.src.model.Student;
import com.kev.CreateExam.src.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author kevin
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/find")
    public ResponseEntity findStudents() {
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity findStudentById(@PathVariable long id) {
        Student student = studentService.findById(id);
        return ResponseEntity.ok().body(student);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable long id) {
        Student studentFound = studentService.findById(id);
        boolean isEmpty = studentFound == null;
        if (isEmpty) {
            return ResponseEntity.status(406).build();
        }
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }
    
    @PutMapping("/update")
    public ResponseEntity<?> updateStudent(@RequestBody Student student){
        long id = student.getId();
        Student studentFound = studentService.findById(id);
        boolean isEmpty = studentFound == null;
        if (isEmpty) {
            return ResponseEntity.status(406).build();
        }
        return ResponseEntity.ok().build();
    }
}
