package com.zzzsj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 79282
 * 使用 @FeignClient 注解来指定这个接口所要调用的服务名称
 */
@FeignClient("eureka-producer")
public interface HelloService {
     @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
}
