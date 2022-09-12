package com.wilsonpaiva.testejunit.repositories;

import com.wilsonpaiva.testejunit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
