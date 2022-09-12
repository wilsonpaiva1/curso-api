package com.wilsonpaiva.testejunit.services.impl;

import com.wilsonpaiva.testejunit.domain.User;
import com.wilsonpaiva.testejunit.repositories.UserRepository;
import com.wilsonpaiva.testejunit.services.UserService;
import com.wilsonpaiva.testejunit.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
     }
}
