package com.ftn.sbnz.repository;

import com.ftn.sbnz.model.models.User;

public interface IUserRepository {
    public User findUser(String username);
    public User login(String username, String pass);
}
