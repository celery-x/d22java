package com.example.webapplication;

import edu.cqupt.d2.domain.*;
import edu.cqupt.d2.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static edu.cqupt.d2.controller.GreaterFind.*;

public class UserTest {

    ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
    UserService testService = (UserService) ctx.getBean("userService");


    @Test
    public void testfindUserbyId() {
        User test = testService.getUserById("111");
        System.out.println(test);
    }

    @Test
    public void testSaveUser() {
        User test = new User();
        test.setUid("222");
        test.setUser_password("save");
        test.setUser_phone("19919999999");
        test.setUser_name("SaveUser");
        testService.saveUser(test);
        System.out.println(test);
    }

    @Test
    public void testUpdateUser() {
        User test = new User();
        test.setUid("333");
        test.setUser_password("111");
        test.setUser_phone("111");
        test.setUser_name("111");
        testService.alterUser(test);
        System.out.println(test);
    }
    @Test
    public void testHead() {
        User u=testService.getUserById("111");
        byte[] bf=readFile("E:\\Head\\image.jpg");
        String path=getHeadPath("aaa.jpg",u.getUid());
        testService.setHead(u.getUid(),path);
        writeBytesToFile(bf,path);
    }

}
