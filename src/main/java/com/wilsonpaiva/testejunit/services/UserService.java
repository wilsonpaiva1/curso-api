package com.wilsonpaiva.testejunit.services;

import com.wilsonpaiva.testejunit.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
