package com.mycompany.hello;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * Created by MOUNTAIN on 2017/9/19.
 */
@Controller
public class MessagePrinter implements InitializingBean {

    private MessageService messageService;

    @PostConstruct
    public void initMethod() {
        System.out.println("post init");
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessagePrinter() {
    }

    public void printMessage() {
        System.out.println("printMessage");
        System.out.println(messageService.getMessage());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("initializingBean====");
    }
}
