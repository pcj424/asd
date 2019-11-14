package com.itclas.dao.imp;

import com.itclas.dao.UserDao;
import com.itclas.uts.User;

import javax.sql.rowset.Predicate;
import java.util.List;
import java.util.Map;

public class UserDaoImp implements UserDao {
    private List<String> list;
    private Map<String , User> mapUser;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMapUser(Map<String, User> mapUser) {
        this.mapUser = mapUser;
    }
    //    private  String username;
//    private  int age;
//
//    public UserDaoImp(String username, int age) {
//        this.username = username;
//        this.age = age;
//    }
//
//    public UserDaoImp() {
//    }

    //    public void setUsername(String username) {
//        this.username = username;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
    //    public UserDaoImp() {
//        System.out.println("我UserDaoImp被创建了");
//    }
//    public void inin(){
//        System.out.println("我被初始化了");
//    }
//    public void dayge(){
//        System.out.println("我被销毁了");
//    }

    public void casual() {
        System.out.println(list);
        System.out.println(mapUser);
        System.out.println("Spring.....入门成功");
    }
}
