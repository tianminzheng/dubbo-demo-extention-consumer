package com.jiker.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiker.dubbo.demo.AsyncUserService;
import com.jiker.dubbo.demo.User;
import com.jiker.dubbo.demo.UserService;

import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();

        AsyncUserService asyncUserService = context.getBean("asyncUserService", AsyncUserService.class);
        CompletableFuture<User> future = asyncUserService.getUserByUserNameAsync("*");

        System.out.println("result: " + future.get());
    }
}
