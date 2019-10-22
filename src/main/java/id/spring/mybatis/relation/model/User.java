package id.spring.mybatis.relation.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	private Integer userId;
	private String emailid;
	private String name;
	private List<Post> posts;
	
}
