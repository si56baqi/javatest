package com.si56baqi.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="provider-user")
public interface HelloFeign {

    /*
     * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
     */
    @RequestMapping(value="/hello/{name}",method= RequestMethod.GET)
    public String hello(@PathVariable("name") String name);
}
