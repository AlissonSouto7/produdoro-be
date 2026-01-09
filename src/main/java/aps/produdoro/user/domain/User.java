package aps.produdoro.user.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "user")
@Getter
public class User {
	
	@Id
	private UUID userId;
	@Email
	@Indexed
	private String email;
	private UserSettings settings;
	@Builder.Default
	private UserStatus status = UserStatus.FOCUS;
	@Builder.Default
	private Integer pomodoroCount = 0;
}