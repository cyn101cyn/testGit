package com.cloud.service;

// name: 服务者application.yml中的spring.application.name
// fallback: 断路器执行方法，即方法执行失败调用

import com.cloud.service.impl.DemoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="demo-provider", fallback = DemoServiceFallback.class)
public interface DemoFeignService extends IDemoApi{
}
