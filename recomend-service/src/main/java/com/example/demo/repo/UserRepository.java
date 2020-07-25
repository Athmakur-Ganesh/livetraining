package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.example.demo.entity.User;

public interface UserRepository extends QueryByExampleExecutor<User>, JpaRepository<User, Integer> {

}
