package com.wilsonpaiva.testejunit.config;

import com.wilsonpaiva.testejunit.domain.User;
import com.wilsonpaiva.testejunit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;
    @Bean
    public void startDB(){
        User user1 = new User(null,"wilson","wspdxxxx@gmail.com","1234");
        User user2 = new User(null,"vanessa","vanedssaxxxx@gmail.com","4321");
        repository.saveAll(List.of(user1,user2));

    }

}
