package com.wilsonpaiva.testejunit.resources;

import com.wilsonpaiva.testejunit.domain.User;
import com.wilsonpaiva.testejunit.domain.dto.UserDTO;
import com.wilsonpaiva.testejunit.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource{

    @Autowired
    private ModelMapper mapper;


    @Autowired
    private UserService service;

    @RequestMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id){

    return ResponseEntity.ok().body(mapper.map(service.findById(id),UserDTO.class));
    }
}
