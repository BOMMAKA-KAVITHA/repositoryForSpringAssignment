package com.example.Flipkart.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.Flipkart.dao.FlipkartDaoInterface;
import com.example.Flipkart.entity.FlipkartUser;

@Service
@Transactional
@Scope(scopeName="prototype")
public class FlipkartService implements FlipkartServiceInterface{
	
	@Autowired
	private FlipkartDaoInterface fd;

	@Override
	public String createProfileService(FlipkartUser fu) {
		fd.save(fu);
		return "profile created";
	}

	@Override
	public List<FlipkartUser> getAllUsers() {
		
		return fd.findAll();
	}

	@Override
	public String loginProfileService(int uid, String password) {
		fd.findByIdandPassword(uid, password);
		return "profile found.";
	}

	@Override
	public String updateProfileService(FlipkartUser fu) {
		fd.saveAndFlush(fu);
		return "profile updated";
	}

	@Override
	public FlipkartUser getProfileService(int uid) {
		FlipkartUser ss=null;
		Optional<FlipkartUser> oo=fd.findById(uid);
		if(oo.isPresent()) {
		ss=oo.get();
	}
		return ss;
	}

	@Override
	public String loginService(FlipkartUser fu) {
		List<FlipkartUser> allUsers = getAllUsers();
		String result="";
		for(FlipkartUser u : allUsers) {
			if(u.getName().equals(fu.getName()) && u.getPassword().equals(fu.getPassword())) {
				result="Login Success";
			}
			else {
				result="Login Failed";
			}
		}
		return result;
	}
}
