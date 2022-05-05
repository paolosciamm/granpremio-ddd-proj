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
public class PilotaEntity {
    @Id
    @Column(name ="code")
    private Integer codice;
    @Column(name = "surname")
    private String cognome;
    @Column(name = "name")
    private String nome;
    @Column(name = "team")
    private String scuderia;
}
