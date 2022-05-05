package it.granpremio.project.port.out;

import it.granpremio.project.domain.granpremio.Granpremio;

public interface GranpremioPortOut {
    Granpremio getGPByCode(Integer code);
}
