package aps.produdoro.credencial.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "credentials")
public class Credentials {
	
	@MongoId(targetType = FieldType.STRING)
	@Getter
	private String user;
	private String password;

	public Credentials(String user, String password) {
		super();
		this.user = user;
		this.password = new BCryptPasswordEncoder().encode(password);
	}
	
	public String getPassword() {
		return password;
	}

}
