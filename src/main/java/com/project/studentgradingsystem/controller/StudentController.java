package com.project.studentgradingsystem.controller;

import com.project.studentgradingsystem.model.Student;
import com.project.studentgradingsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/students", method = RequestMethod.GET) // get
    public String getAllStudents(Model model) {
        Student s1 = new Student(1, "ali", "aliwasfi12321@gmail.com", LocalDate.of(2002, 11, 27), 20);
        Student s2 = new Student(2, "ahmad", "ahmadwasfi12321@gmail.com", LocalDate.of(1999, 9, 3), 25);
        Student s3 = new Student(3, "moh", "mohwasfi12321@gmail.com", LocalDate.of(2009, 8, 21), 13);

        // model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("students", List.of(s1, s2, s3));
        return "hello";
    }
    @RequestMapping("/students/{id}") // get
    @ResponseBody
    public Optional<Student> getStudent(@PathVariable long id) {
        return studentService.getStudent(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/students") // post
    @ResponseBody
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    @ResponseBody
    public void updateStudent(@PathVariable long id, @RequestBody Student student) { // update
        studentService.updateStudent(id, student);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}") // this is DELETE request
    @ResponseBody
    public void deleteTopic(@PathVariable long id) {
        studentService.deleteTopic(id);
    }


}