package it.granpremio.project.domain.granpremio;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jmolecules.ddd.annotation.AggregateRoot;

@AggregateRoot
@Data
@RequiredArgsConstructor
public class Scuderia {
    private final Integer code;
    private final Integer nome;
    private final String nazione;
}
