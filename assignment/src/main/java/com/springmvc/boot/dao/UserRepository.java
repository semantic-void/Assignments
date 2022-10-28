package com.springmvc.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.boot.model.UserTable;

public interface UserRepository extends JpaRepository<UserTable, Integer> {

}
