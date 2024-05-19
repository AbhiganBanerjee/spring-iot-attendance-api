package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "members")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Members {
	@Id
	private String _id;
	
	private String name;
	private String role;
	private String desc;
	private String mail;
	private String linkedIn;
	private String image;
	private String icon;
}

/*
 Shreasi : https://i.ibb.co/g3y81m2/img1.png
*/
