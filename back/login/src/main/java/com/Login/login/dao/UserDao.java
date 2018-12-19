package com.Login.login.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.Login.login.model.User;


public interface UserDAO extends CrudRepository<User, Long> {
	
	@Query(value="INSERT INTO User(id, name, password) VALUES(:id, :name , :password )"
			+ "AND a.password = :password")
	void createUser(@Param("id") String id, @Param("name") String name, @Param("password") String password);
	
//	List<User> findAll();
}
