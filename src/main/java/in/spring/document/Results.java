package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Results {
	@Id
	private String _id;

	private String image;
	private String name;
	private String desc;
}
