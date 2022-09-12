package com.wilsonpaiva.testejunit.services;

import com.wilsonpaiva.testejunit.domain.User;

public interface UserService {

    User findById(Integer id);
}
