package com.springmvc.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springmvc.boot.model.EmailTable;

public interface EmailRepository extends JpaRepository<EmailTable, Integer> {
	
	@Query("SELECT count(*) FROM  EmailTable where user_id = :id")
	Integer findNumber(Integer id);
}
