package com.zzzsj.service;

import com.zzzsj.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 79282
 * 在服务熔断的时候返回 fallback 类中的内容。
 */
@FeignClient(name = "eureka-producer",fallback= HelloRemoteHystrix.class)
public interface HelloRemote {
     @GetMapping("/hello/username")
    String hello(@RequestParam(value = "name") String name);
}
