package com.fernandoborgmann.teacherTutorManager.repository;

import com.fernandoborgmann.teacherTutorManager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
