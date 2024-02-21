package com.mohamedyasser.lakesidehotel.service;

import com.mohamedyasser.lakesidehotel.model.User;

import java.util.List;



public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
