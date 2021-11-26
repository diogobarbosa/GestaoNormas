package org.indtexbr.gestaonormas.adapters.controllers;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaonormas.adapters.dto.NormaDTO;
import org.springframework.http.ResponseEntity;

public interface NormaAdapter{

	public ResponseEntity<Void> inserirNorma(NormaDTO norma);
	
	public ResponseEntity<List<NormaDTO>> consultarNormas();

	public ResponseEntity<NormaDTO> consultarNorma(UUID idNorma);
	
	public ResponseEntity<Void> alterarNorma(NormaDTO norma);
	
	public ResponseEntity<Void> deletarNorma(UUID idNorma);
}
