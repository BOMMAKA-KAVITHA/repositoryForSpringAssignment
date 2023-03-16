package com.example.Flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Flipkart.entity.FlipkartUser;
import com.example.Flipkart.service.FlipkartServiceInterface;

@RestController
public class FlipkartController {
	
	@Autowired
	private FlipkartServiceInterface fs;

	@PostMapping("createProfile")
	public String createProfile(@RequestBody FlipkartUser fu) {
		return fs.createProfileService(fu);
	}
	
	@GetMapping("viewAllProfile")
	public List<FlipkartUser> viewAll(){
		return fs.getAllUsers();
	}
	
	@GetMapping("loginProfile/{id}/{password}")
	public String loginProfile(@PathVariable("id")int uid,@PathVariable("password")String password) {
		return fs.loginProfileService(uid,password);
	}
	
	@PutMapping("updateProfile/{id}")
	public String updateProfile(@PathVariable("id")int uid,@RequestBody FlipkartUser fu) {
		return fs.updateProfileService(fu);
	}
	
	@GetMapping("viewProfile/{id}")
	public FlipkartUser viewProfile(@PathVariable("id") int uid) {
		return fs.getProfileService(uid);
	}
	
	@PostMapping("login")
	public String login(@RequestBody FlipkartUser fu) {
		return fs.loginService(fu);
	}
	
}
