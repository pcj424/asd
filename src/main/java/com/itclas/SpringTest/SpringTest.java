package com.itclas.SpringTest;

import com.itclas.dao.UserDao;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicatincContext.xml");
        UserDao userDao = (UserDao) app.getBean("UserDao");
        userDao.casual();
    }
}
