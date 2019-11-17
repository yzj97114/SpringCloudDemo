package com.zzzsj.service.impl;


import com.zzzsj.mapper.StudentMapper;
import com.zzzsj.model.Student;
import com.zzzsj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> queryStudentList() {

        return studentMapper.selectStudentList();
    }


    @Override
    public void addStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    @Override
    public int deleteStudentById(Integer id) {

        return studentMapper.deleteStudentById(id);
    }

    @Override
    public int modifyStudentById(Student student) {

        return studentMapper.updateStudentById(student);
    }

    @Override
    public Student queryStudentById(Integer id) {


        Student student = studentMapper.selectStudentById(id);

        return student;

    }
}
