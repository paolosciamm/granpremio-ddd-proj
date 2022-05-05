package it.granpremio.project.infrastructure.jpa.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class GranpremioEntity {
    @Id
    @NotNull
    @Column(name="code", length = 4)
    private Integer code;

    @NotNull
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name="nation")
    private String nation;

    @NotNull
    @Column(name="length")
    private Double length;
}