package org.indtexbr.adapters;

import java.util.List;
import java.util.UUID;

import org.indtexbr.entities.NormaEntity;
import org.springframework.http.ResponseEntity;

public interface NormaAdapter{

	public ResponseEntity<Void> inserirNorma(NormaEntity norma);
	
	public ResponseEntity<List<NormaEntity>> consultarNormas();

	public ResponseEntity<NormaEntity> consultarNorma(UUID idNorma);
	
	public ResponseEntity<Void> alterarNorma(NormaEntity norma);
	
	public ResponseEntity<Void> deletarNorma(UUID idNorma);
}
