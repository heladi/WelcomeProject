package com.Login.login.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.Login.login.model.User;


public interface UserDAO extends CrudRepository<User, Long> {
	
	@Query(value="INSERT INTO User(id, name, password) VALUES (:id, :name , :password)", nativeQuery=true)
	void saveUser(@Param("id") Long id, @Param("name") String name, @Param("password") String password);
	
	@Query(value="SELECT a from Admin AS a " 
			+ "WHERE a.name = :name "
			+ "AND a.password = :password", nativeQuery=true)
	User isUserValid(@Param("name") String name, @Param("password") String password); 

}
