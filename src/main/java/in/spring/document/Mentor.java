package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "mentor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {
	@Id
	private String _id;
	
	private String name;
	private String role;
	private String desc;
	private String mail;
	private String image;
}
/*
	ABHB : https://i.ibb.co/k2d8dKB/Screenshot-2024-05-18-210600.png
*/