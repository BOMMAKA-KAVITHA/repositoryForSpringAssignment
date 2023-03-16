package com.example.Flipkart.service;

import java.util.List;

import com.example.Flipkart.entity.FlipkartUser;

public interface FlipkartServiceInterface {

	String createProfileService(FlipkartUser fu);

	List<FlipkartUser> getAllUsers();

	String loginProfileService(int uid, String password);

	String updateProfileService(FlipkartUser fu);

	FlipkartUser getProfileService(int uid);

	String loginService(FlipkartUser fu);

	

	



}
