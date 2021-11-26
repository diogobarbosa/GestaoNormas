package org.indtexbr.gestaonormas.adapters.mappers;

import org.indtexbr.gestaonormas.adapters.dto.NormaDTO;
import org.indtexbr.gestaonormas.application.entities.NormaEntity;

public class NormaMapper {

	public static NormaEntity normaDTOToNormaEntity(NormaDTO normaDTO) {
		
		NormaEntity normaEntity = new NormaEntity();
		if(normaDTO != null) {
			normaEntity.setIdNorma(normaDTO.getIdNorma());
			normaEntity.setTituloNorma(normaDTO.getTituloNorma());
			normaEntity.setTextoNorma(normaDTO.getTextoNorma());
			normaEntity.setRegulamentacao(normaDTO.getRegulamentacao());
			normaEntity.setDataNorma(normaDTO.getDataNorma());
		}
		return normaEntity;
	}
	
	public static NormaDTO normaEntityToNormaDTO(NormaEntity normaEntity) {
		
		NormaDTO normaDTO = new NormaDTO();
		if(normaEntity != null) {
			normaDTO.setIdNorma(normaEntity.getIdNorma());
			normaDTO.setTituloNorma(normaEntity.getTituloNorma());
			normaDTO.setTextoNorma(normaEntity.getTextoNorma());
			normaDTO.setRegulamentacao(normaEntity.getRegulamentacao());
			normaDTO.setDataNorma(normaEntity.getDataNorma());
		}
		return normaDTO;
	}
}
