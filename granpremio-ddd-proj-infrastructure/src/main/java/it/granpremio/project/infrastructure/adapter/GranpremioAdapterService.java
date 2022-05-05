package it.granpremio.project.infrastructure.adapter;

import it.granpremio.project.domain.granpremio.Granpremio;
import it.granpremio.project.infrastructure.jpa.entity.GranpremioEntity;
import it.granpremio.project.infrastructure.jpa.repository.GranpremioRepository;
import it.granpremio.project.infrastructure.mapper.GranpremioMapper;
import it.granpremio.project.port.out.GranpremioPortOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GranpremioAdapterService implements GranpremioPortOut {

    private final GranpremioRepository granpremioRepository;
    private final GranpremioMapper granpremioMapper = new GranpremioMapper();

    @Override
    public Granpremio getGPByCode(Integer code) {
        Optional<GranpremioEntity> res = granpremioRepository.findById(code);
        if(res.isPresent())
        {
            return granpremioMapper.granpremioFromEntity2Domain(res.get());
        }else{
            throw new EntityNotFoundException();
        }
    }
}
