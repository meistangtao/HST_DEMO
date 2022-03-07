package com.hst.service.impl.dubbo;

import com.hst.api.rpc.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
@Slf4j
public class HelloServiceImpl implements IHelloService {
    @Override
    public String hello(String name) {
        log.info("HelloServiceImpl hello:{}",name);
        return String.format("HelloServiceImpl hello: %s",name);
    }
}
