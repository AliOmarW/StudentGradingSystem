package com.project.studentgradingsystem.service;

import com.project.studentgradingsystem.model.Student;
import com.project.studentgradingsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Optional<Student> getStudent(long id) {
        return studentRepository.findById(id);
    }
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
    public void updateStudent(long id, Student student) {
        studentRepository.save(student);
    }
    public void deleteTopic(long id) {
        studentRepository.deleteById(id);
    }
}