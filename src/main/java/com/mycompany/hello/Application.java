package com.mycompany.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MOUNTAIN on 2017/9/19.
 */
@Configuration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
//        MessagePrinter messagePrinter = context.getBean("messagePrinter",MessagePrinter.class);
//        MessageService bean = context.getBean("messageService", MessageService.class);
//        String message = bean.getMessage();
//        System.out.println(message);
//        messagePrinter.printMessage();
        Example example = context.getBean("example", Example.class);
        example.addLink("1","www.baidu.com");

    }
}
