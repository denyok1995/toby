package com.toby.spring.dao;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = getConnection();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }
    public UserDao accountDao() {
        ConnectionMaker connectionMaker = getConnection();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }
    public UserDao messageDao() {
        ConnectionMaker connectionMaker = getConnection();
        UserDao userDao = new UserDao(connectionMaker);
        return userDao;
    }

    private ConnectionMaker getConnection() {
        return new DConnectionMaker();
    }
}
