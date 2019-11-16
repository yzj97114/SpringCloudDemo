package com.zzzsj.hystrix;

import com.zzzsj.service.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @author 79282
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello world";
    }
}
