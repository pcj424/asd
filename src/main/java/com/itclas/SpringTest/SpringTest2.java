package com.itclas.SpringTest;

import com.itclas.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {
    @Test
    public void Test(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicatincContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("UserDao");
        System.out.println(userDao1);
        app.close();
    }
}
