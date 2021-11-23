package org.indtexbr.ports;

import java.util.UUID;

import org.indtexbr.entities.NormaEntity;
import org.springframework.data.repository.CrudRepository;

public interface NormaRepository extends CrudRepository<NormaEntity, UUID>{

}
