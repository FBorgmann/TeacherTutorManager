package com.fernandoborgmann.teacherTutorManager.controller;

import com.fernandoborgmann.teacherTutorManager.model.Student;
import com.fernandoborgmann.teacherTutorManager.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.create(student);
    }

    @GetMapping
    public List<Student> findAll() {
        return service.findAll();
    }
}
