package org.test.studentstest.dto;

import java.time.Instant;
import java.util.UUID;

public class StudentResponseDto extends StudentRequestDto {
    private UUID id;
    private Instant createdAt;
    private Instant updatedAt;

    public StudentResponseDto() {
        super();
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
