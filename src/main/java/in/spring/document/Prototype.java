package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "prototype")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prototype {
	@Id
	private String _id;

	private String image;
	private String name;
	private String desc;
}

/*1.https://i.postimg.cc/VvRzQcT6/IMG-20240513-180729.jpg
 *2.https://i.postimg.cc/mD3sCsTw/IMG-20240513-180601.jpg
 *3.https://i.postimg.cc/HW2mLdZW/IMG-20240513-180614.jpg
 *4.https://i.postimg.cc/HkfDNxxz/IMG-20240513-180915.jpg
 */









