package com.zzzsj.service;


import com.zzzsj.model.Student;

import java.util.List;

/**
 * @author 79282
 */
public interface StudentService {

    //查询
    public List<Student> queryStudentList();

    //增加
    public void addStudent(Student student);

    //删除

    public int deleteStudentById(Integer id);
    //修改
    public int modifyStudentById(Student student);

    //根据id查询
    public Student queryStudentById(Integer id);


}
