package it.granpremio.project.infrastructure.mapper;

import it.granpremio.project.domain.granpremio.Granpremio;
import it.granpremio.project.infrastructure.jpa.entity.GranpremioEntity;

public class GranpremioMapper {
    public Granpremio granpremioFromEntity2Domain(GranpremioEntity gp){
        return new Granpremio(gp.getCode(),
                gp.getName(),
                gp.getNation(),
                gp.getLength()
                );
    }
}
