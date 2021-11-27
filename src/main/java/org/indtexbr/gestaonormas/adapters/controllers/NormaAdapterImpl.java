package org.indtexbr.gestaonormas.adapters.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaonormas.adapters.dto.NormaDTO;
import org.indtexbr.gestaonormas.adapters.mappers.NormaMapper;
import org.indtexbr.gestaonormas.ports.NormaPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class NormaAdapterImpl implements NormaAdapter{

	@Autowired
	private NormaPort normaUseCase;
	
	@GetMapping("/normas")
	public ResponseEntity<List<NormaDTO>> consultarNormas() {

		List<NormaDTO> listaNormaDTO = new ArrayList<NormaDTO>();
		normaUseCase.consultarNormas().forEach( normaEntity -> {
						NormaDTO normaDTO = NormaMapper.normaEntityToNormaDTO(normaEntity);
						listaNormaDTO.add(normaDTO);
					});
		
		return ResponseEntity.ok(listaNormaDTO);
	}
	
	@GetMapping("/normas/{idNorma}")
	public ResponseEntity<NormaDTO> consultarNorma(@PathVariable UUID idNorma) {

		return ResponseEntity.ok(NormaMapper.normaEntityToNormaDTO(normaUseCase.consultarNorma(idNorma)));
	}

	@PostMapping("/normas")
	public ResponseEntity<Void> inserirNorma(@RequestBody NormaDTO norma) {
		
		normaUseCase.inserirNorma(NormaMapper.normaDTOToNormaEntity(norma));
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/normas/{idNorma}")
	public ResponseEntity<Void> alterarNorma(@PathVariable UUID idNorma, @RequestBody NormaDTO norma) {
		
		norma.setIdNorma(idNorma);
		normaUseCase.alterarNorma(NormaMapper.normaDTOToNormaEntity(norma));
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/normas/{idNorma}")
	public ResponseEntity<Void> deletarNorma(@PathVariable UUID idNorma) {

		normaUseCase.deletarNorma(idNorma);
		return  ResponseEntity.noContent().build();
	}
	
}
