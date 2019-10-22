package id.spring.mybatis.relation.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post {
	
	private Integer postId;
	private String title;
	private String content;
	private String createdOn;
//	private User user;
	
	
	
}
