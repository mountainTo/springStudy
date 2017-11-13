package com.mycompany.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class Example {

  // inject the actual template
  @Autowired
  private RedisTemplate<String, String> template;

  // inject the template as ListOperations
  @Resource(name="redisTemplate")
  private ListOperations<String, String> listOps;

//  public void addString(String key, String value) {
//    template.set
//  }

  public void addLink(String userId, String url) {
    listOps.leftPush(userId, url);
  }
}