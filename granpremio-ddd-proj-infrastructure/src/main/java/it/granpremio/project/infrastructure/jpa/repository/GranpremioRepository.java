package it.granpremio.project.infrastructure.jpa.repository;

import it.granpremio.project.infrastructure.jpa.entity.GranpremioEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GranpremioRepository extends PagingAndSortingRepository<GranpremioEntity,Integer> {
}
