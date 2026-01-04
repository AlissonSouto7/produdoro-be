package aps.produdoro.pomodoro.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "default_configurations")
@Getter
public class DefaultConfiguration {

	private static final String DEFAULT_CODE = "DEFAULT";

	@Builder.Default
    @MongoId(targetType = FieldType.STRING)
    private String code = DEFAULT_CODE;
    
    private Integer focusTimeMinutes;
    private Integer shortBreakTimeMinutes;
    private Integer longBreakTimeMinutes;
    private Integer roundsBeforeLongBreak;
    
}