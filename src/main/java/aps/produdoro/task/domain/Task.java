package aps.produdoro.task.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "tasks")
@Getter
public class Task {
    @Id
    private UUID taskId;
    private String name;
    private String description;
    @Builder.Default
	private TaskStatus status = TaskStatus.TO_DO;
    @Indexed
    private UUID areaId;
	@Indexed
    private UUID userId;
	@Indexed
	private UUID projectId;
}
