package com.itclas.service.impl;

import com.itclas.dao.UserDao;
import com.itclas.dao.imp.UserDaoImp;
import com.itclas.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao ;//= new UserDaoImp();

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public void casual() {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicatincContext.xml");
//        UserDao userDao1 = (UserDao) app.getBean("UserDao");
//        System.out.println("我入了UserServiceImp");
//        userDao1.casual();
        userDao.casual();
    }
}
