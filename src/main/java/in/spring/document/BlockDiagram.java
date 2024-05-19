package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "blockdiag")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlockDiagram {
	@Id
	private String _id;
	
	private String name;
	private String image;
	private String desc;
	private String icon;
}
