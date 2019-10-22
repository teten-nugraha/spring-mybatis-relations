package id.spring.mybatis.relation.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import id.spring.mybatis.relation.model.User;

@Mapper
public interface UserRepository {
	
	User selectUserById(Integer user_id);
	
	List<User> selectAllUsers();
	
	void saveUser(User user);
	
	void deleteUser(Integer id);
	
	void updateUser(User user);

}