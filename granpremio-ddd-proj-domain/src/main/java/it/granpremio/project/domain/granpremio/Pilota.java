package it.granpremio.project.domain.granpremio;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jmolecules.ddd.annotation.AggregateRoot;

@AggregateRoot
@Data
@RequiredArgsConstructor
public class Pilota {
    private final Integer codice;
    private final String cognome;
    private final String nome;
    private final String scuderia;
}
