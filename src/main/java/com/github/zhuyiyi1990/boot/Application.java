package com.github.zhuyiyi1990.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        ApplicationContext parentContext = context.getParent();
        System.out.println("context = " + context);
        System.out.println("parentContext = " + parentContext);
    }

}