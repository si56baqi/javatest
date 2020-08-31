package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Ribbon随机负载算法
@Configuration
public class RibbonRuleConfig {
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
