package it.granpremio.project.orchestration;

import it.granpremio.project.domain.granpremio.Granpremio;
import it.granpremio.project.error.GranpremioNonPresenteException;
import it.granpremio.project.port.in.GranpremioUseCase;
import it.granpremio.project.port.out.GranpremioPortOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class GranpremioOrchestrationService implements GranpremioUseCase {

    private final GranpremioPortOut granpremioPortOut;

    @Override
    public Granpremio getGPByCode(Integer code) {
        try{
            Granpremio res = granpremioPortOut.getGPByCode(code);
            return res;
        }catch(EntityNotFoundException e){
            throw new GranpremioNonPresenteException();
        }
    }
}
