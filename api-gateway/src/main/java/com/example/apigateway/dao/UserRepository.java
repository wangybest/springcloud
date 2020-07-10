package com.example.apigateway.dao;

import com.example.apigateway.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsername(String name);

}
