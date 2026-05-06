package com.fernandoborgmann.teacherTutorManager.service;

import com.fernandoborgmann.teacherTutorManager.model.Student;
import com.fernandoborgmann.teacherTutorManager.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository repository) {
        this.studentRepository = repository;
    }

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
