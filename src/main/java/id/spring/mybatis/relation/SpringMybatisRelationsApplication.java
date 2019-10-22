package id.spring.mybatis.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import id.spring.mybatis.relation.model.User;
import id.spring.mybatis.relation.service.UserService;

@SpringBootApplication
public class SpringMybatisRelationsApplication {
	
	@Autowired
	private UserService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisRelationsApplication.class, args);
	}

	

}
