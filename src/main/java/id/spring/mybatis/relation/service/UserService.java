package id.spring.mybatis.relation.service;

import java.util.List;
import java.util.Optional;

import id.spring.mybatis.relation.model.User;

public interface UserService {
	
	User selectUserById(Integer id);
	
	List<User> selectAllUsers();
	
	void saveUser(User user);
	
	void deleteUser(Integer id);
	
	void updateUser(User user);
	
}
