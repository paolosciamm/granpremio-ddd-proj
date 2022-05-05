package it.granpremio.project.domain.granpremio;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.jmolecules.ddd.annotation.AggregateRoot;

@AggregateRoot
@Data
@RequiredArgsConstructor
public class Piazzamento {
    private final Integer pilota;
    private final Integer granpremio;
    private final Integer anno;
    private final Integer posizione;
}
