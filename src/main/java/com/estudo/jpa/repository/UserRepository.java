package com.estudo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.jpa.model.User;

public interface UserRepository extends JpaRepository<Long, User>{

}
