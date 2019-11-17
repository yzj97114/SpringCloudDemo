package com.zzzsj.controller;

import com.zzzsj.model.Student;
import com.zzzsj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("page")
    public List<Student> selectStudentList() {
        List<Student> students = studentService.selectStudentList();
        return students;
    }

}
