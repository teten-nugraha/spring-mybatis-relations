package id.spring.mybatis.relation.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.spring.mybatis.relation.model.Post;
import id.spring.mybatis.relation.model.User;
import id.spring.mybatis.relation.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("{user_id}")
	public ResponseEntity<User> getPostsFrom1User(@PathVariable("user_id") Integer id) {
		User user = userService.selectUserById(id);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
}
