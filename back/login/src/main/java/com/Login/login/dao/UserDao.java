package com.Login.login.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import com.Login.login.entity.User;

@Transactional
public interface UserDAO extends CrudRepository<User, Long> {
	
//	@Query(value="INSERT INTO User(id, name, password) VALUES (:id, :name , :password)", nativeQuery=true)
//	void saveUser(@Param("id") Long id, @Param("name") String name, @Param("password") String password);
//	
//	@Query(value="SELECT a from Admin AS a " 
//			+ "WHERE a.name = :name "
//			+ "AND a.password = :password", nativeQuery=true)
//	User isUserValid(@Param("name") String name, @Param("password") String password); 
	
	User findByname(String name);
	
	User findById(Long id);
	
	
}
