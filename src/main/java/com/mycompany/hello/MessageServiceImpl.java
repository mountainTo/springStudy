package com.mycompany.hello;

import javax.annotation.PostConstruct;

/**
 * Created by MOUNTAIN on 2017/9/19.
 */
public class MessageServiceImpl implements MessageService{

    @PostConstruct
    public void init() {
        System.out.println("MessagePrinter 初始化===========");
        /*需引入对应jedis的pom依赖*/
//        Jedis jedis = new Jedis("localhost", 6379);
//        String set = jedis.set("key", "vlaue", "NX", "EX", 20L);
//        jedis.mset("key","0");
//        String[] s = {"1", "a"};
//        jedis.msetnx(s);
//        jedis.msetnx("a", "1","b","2");
    }

    public String getMessage() {
        return "hello world";
    }
}
