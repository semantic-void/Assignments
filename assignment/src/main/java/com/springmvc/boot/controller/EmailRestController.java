package com.springmvc.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.boot.dao.EmailRepository;
import com.springmvc.boot.model.EmailTable;

@RestController
public class EmailRestController {
	@Autowired
	private EmailRepository emailRepository;

	@PostMapping("email")
	public String addEmail(@RequestBody EmailTable emailTable) {
		emailRepository.save(emailTable);
		return "Email saved";
	}

	@GetMapping("emails/count")
	public Integer getEmailsById(@RequestParam("user") String id) {

		return emailRepository.findNumber(Integer.parseInt(id));
	}
}