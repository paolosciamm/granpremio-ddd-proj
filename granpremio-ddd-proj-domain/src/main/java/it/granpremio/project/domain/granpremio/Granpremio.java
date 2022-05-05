package it.granpremio.project.domain.granpremio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jmolecules.ddd.annotation.AggregateRoot;

@AggregateRoot
@Data
@AllArgsConstructor
public class Granpremio {
    private final Integer code;
    private final String name;
    private final String nation;
    private final Double length;
}
