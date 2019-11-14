package com.itclas.wbe.servlet;

import com.itclas.service.UserService;
import com.itclas.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringServlet {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("appLicatincContext.xml");
        UserService userService = (UserService) app.getBean("Service");
        userService.casual();

//        UserService service = new UserServiceImpl();
//        service.casual(); //空指针异常
    }
}
