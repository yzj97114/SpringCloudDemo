package com.zzzsj.service;


import com.zzzsj.hystrix.HelloRemoteHystrix;
import com.zzzsj.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "eureka-producer",fallback= HelloRemoteHystrix.class)
public interface StudentService {
    @GetMapping("/student/page")
    List<Student> selectStudentList();
}
