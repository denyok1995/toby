package com.toby.spring.dao;

import com.toby.spring.domain.User;

import java.sql.SQLException;

public class UserDaoTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new DaoFactory().userDao();

        User user = new User();
        user.setId("whiteship");
        user.setPassword("married");
        user.setName("백기선");

        dao.add(user);
        System.out.println(user.getId()+" 등록 성공!");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getId()+" 조회 성공");
    }
}
