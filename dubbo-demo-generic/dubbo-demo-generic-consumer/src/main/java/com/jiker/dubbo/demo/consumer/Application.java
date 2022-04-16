package com.jiker.dubbo.demo.consumer;

import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiker.dubbo.demo.UserService;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();

        GenericService userService = (GenericService)context.getBean("paramsUserService");

        String[] parameterTypes = new String[] {"com.jiker.dubbo.demo.UserParams"};
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("class", "com.jiker.dubbo.demo.UserParams");
        param.put("userName", "testUserName");

        System.out.println("result: " + userService.$invoke("getUserByParams", parameterTypes, new Object[]{param}));

    }
}
