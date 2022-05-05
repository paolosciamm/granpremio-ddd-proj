package it.granpremio.project.infrastructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScuderiaEntity {
    @Id
    @Column(name = "code")
    private Integer code;
    @Column(name = "name")
    private Integer nome;
    @Column(name = "nation")
    private String nazione;
}
