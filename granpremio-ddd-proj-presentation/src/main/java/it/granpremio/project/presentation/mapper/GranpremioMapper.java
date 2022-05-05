package it.granpremio.project.presentation.mapper;

import it.granpremio.project.domain.granpremio.Granpremio;
import it.granpremio.project.presentation.response.GranpremioResponse;

public class GranpremioMapper {

    public GranpremioResponse granpremioFromDomain2Response(Granpremio gp){
        return GranpremioResponse.builder()
                .code(gp.getCode())
                .length(gp.getLength())
                .name(gp.getName())
                .nation(gp.getNation())
                .length(gp.getLength())
                .build();
    }
}
