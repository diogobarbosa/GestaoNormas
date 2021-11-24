package org.indtexbr.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.indtexbr.entities.NormaEntity;
import org.indtexbr.ports.NormaPort;
import org.indtexbr.ports.NormaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NormaUserCase implements NormaPort{

	@Autowired
	private NormaRepository normaRepository;
	
	@Override
	public void inserirNorma(NormaEntity normaEntity) {
		
		normaRepository.save(normaEntity);
	}

	@Override
	public List<NormaEntity> consultarNormas() {
		
		List<NormaEntity> listaNorma = new ArrayList<>();
		normaRepository.findAll().forEach(listaNorma::add);
		
		return listaNorma;
	}
	
	@Override
	public NormaEntity consultarNorma(UUID idNorma) {
	
		return normaRepository.findById(idNorma).orElse(null);
	}

	@Override
	public void alterarNorma(NormaEntity normaEntity) {
		
		normaRepository.save(normaEntity);
	}

	@Override
	public void deletarNorma(UUID idNorma) {
		
		normaRepository.deleteById(idNorma);
	}

}
