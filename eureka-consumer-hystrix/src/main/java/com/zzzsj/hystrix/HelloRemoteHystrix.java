package com.zzzsj.hystrix;


import com.zzzsj.model.Student;
import com.zzzsj.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class HelloRemoteHystrix implements StudentService {


    @Override
    public List<Student> selectStudentList() {
        Student student = new Student();
        student.setId(1);
        student.setAge("10");
        student.setName("网吧");
        List<Student> list = new ArrayList<>();
        list.add(student);
        return list;
    }
}
