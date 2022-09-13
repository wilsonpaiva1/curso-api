package com.wilsonpaiva.testejunit.services;

import com.wilsonpaiva.testejunit.domain.User;
import com.wilsonpaiva.testejunit.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO dto);
    void delete(Integer id);
}
