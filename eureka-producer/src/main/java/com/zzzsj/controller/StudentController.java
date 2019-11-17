package com.zzzsj.controller;


import com.zzzsj.model.Student;
import com.zzzsj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 79282
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/page")
    public List<Student> selectStudentList() {
        return studentService.queryStudentList();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {



        studentService.addStudent(student);

        return "添加成功";
    }

    @DeleteMapping("{id}")
    public String deleteStu(@PathVariable Integer id) {


        int i = studentService.deleteStudentById(id);
        if (i == 0) {
            return "删除失败";
        } else {
            return "删除成功";
        }

    }


    @PutMapping
    public String updateStu(@RequestBody Student student) {


        int i = studentService.modifyStudentById(student);
        if (i == 0) {
            return "修改失败";
        } else {
            return "成功";
        }

    }

    @GetMapping("{id}")
    public Object selectStu(@PathVariable Integer id) {

        Student student1 = studentService.queryStudentById(id);
        return student1;
    }

}
