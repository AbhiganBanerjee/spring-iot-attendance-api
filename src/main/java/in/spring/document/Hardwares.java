package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "hardwares")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hardwares {
	
	@Id
	private String _id;
	
	private String name;
	private Double price;
	private String[] pins;
	private String image;
	private String icon;
	private String desc;
}
