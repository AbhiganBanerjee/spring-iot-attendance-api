package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "features")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Features {
	
	@Id
	private String _id;
	
	private String title;
	private String content;
	
	//Only the MUI Icon name with out the </> tags just name
	private String icon;
}
