package it.granpremio.project.port.in;

import it.granpremio.project.domain.granpremio.Granpremio;

public interface GranpremioUseCase {
    Granpremio getGPByCode(Integer code);
}
