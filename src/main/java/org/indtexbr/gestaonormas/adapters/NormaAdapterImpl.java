package org.indtexbr.gestaonormas.adapters;

import java.util.List;
import java.util.UUID;

import org.indtexbr.gestaonormas.entities.NormaEntity;
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
	public ResponseEntity<List<NormaEntity>> consultarNormas() {

		return ResponseEntity.ok(normaUseCase.consultarNormas());
	}
	
	@GetMapping("/normas/{idNorma}")
	public ResponseEntity<NormaEntity> consultarNorma(@PathVariable UUID idNorma) {

		return ResponseEntity.ok(normaUseCase.consultarNorma(idNorma));
	}

	@PostMapping("/normas")
	public ResponseEntity<Void> inserirNorma(@RequestBody NormaEntity norma) {
		
		normaUseCase.inserirNorma(norma);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/normas")
	public ResponseEntity<Void> alterarNorma(@RequestBody NormaEntity norma) {
		normaUseCase.alterarNorma(norma);
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/normas/{idNorma}")
	public ResponseEntity<Void> deletarNorma(@PathVariable UUID idNorma) {

		normaUseCase.deletarNorma(idNorma);
		return  ResponseEntity.noContent().build();
	}
	
}
