package com.github.zhuyiyi1990.starter.autoconfigure;

import com.github.zhuyiyi1990.starter.service.StarterDemoService;
import com.github.zhuyiyi1990.starter.service.impl.StarterDemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAutoConfiguration {

    @Bean
    public StarterDemoService starterDemoService() {
        return new StarterDemoServiceImpl();
    }

}