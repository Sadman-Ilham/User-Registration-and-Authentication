package com.sadman.service;

import com.sadman.model.User;

import java.util.List;

/**
 * Created by Sadman on 8/17/2015.
 */
public interface UserService {

    void addUser (User user);
    void updateUser (User user);
    void deleteUser (int id);
    User getUser (int id);
    List getUsers();

}
