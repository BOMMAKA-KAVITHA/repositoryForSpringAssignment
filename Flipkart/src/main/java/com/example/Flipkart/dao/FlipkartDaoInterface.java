package com.example.Flipkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Flipkart.entity.FlipkartUser;

@Repository
public interface FlipkartDaoInterface extends JpaRepository<FlipkartUser, Integer>{
	
	@Query ("from com.example.Flipkart.entity.FlipkartUser fu where fu.id=:em and fu.password=:pw")
	public void findByIdandPassword(@Param("em")int id,@Param("pw")String password);


	

}
