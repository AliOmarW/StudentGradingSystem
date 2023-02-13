package com.project.studentgradingsystem.repository;

import com.project.studentgradingsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
