package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "softwares")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Softwares {
	@Id
	private String _id;
	
	private String name;
	private String type;
	private String role;
	private String image;
	private String icon;
}
