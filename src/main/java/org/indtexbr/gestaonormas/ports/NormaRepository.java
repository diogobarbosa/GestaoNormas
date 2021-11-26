package org.indtexbr.gestaonormas.ports;

import java.util.UUID;

import org.indtexbr.gestaonormas.application.entities.NormaEntity;
import org.springframework.data.repository.CrudRepository;

public interface NormaRepository extends CrudRepository<NormaEntity, UUID>{

}
