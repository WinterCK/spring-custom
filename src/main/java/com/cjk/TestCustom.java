package com.cjk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjk.common.bean.User;

/**
 * 测试自定义Spring标签
 * @author chenjiangkai
 *
 */
public class TestCustom {

  public static void main(String[] args) {
  // 测试自定义标签
  ApplicationContext bf1 = new ClassPathXmlApplicationContext("user.xml");
  User user = (User) bf1.getBean("testBean");
  System.out.println(user.getUserName() + ", " + user.getEmail());
}
}
