package org.indtexbr.gestaonormas.adapters.dto;

import java.time.LocalDate;
import java.util.UUID;

public class NormaDTO {

	private UUID idNorma;
	private String tituloNorma;
	private String textoNorma;
	private String regulamentacao;
	private LocalDate dataNorma;
	
	public UUID getIdNorma() {
		return idNorma;
	}
	public void setIdNorma(UUID idNorma) {
		this.idNorma = idNorma;
	}
	public String getTituloNorma() {
		return tituloNorma;
	}
	public void setTituloNorma(String tituloNorma) {
		this.tituloNorma = tituloNorma;
	}
	public String getTextoNorma() {
		return textoNorma;
	}
	public void setTextoNorma(String textoNorma) {
		this.textoNorma = textoNorma;
	}
	public String getRegulamentacao() {
		return regulamentacao;
	}
	public void setRegulamentacao(String regulamentacao) {
		this.regulamentacao = regulamentacao;
	}
	public LocalDate getDataNorma() {
		return dataNorma;
	}
	public void setDataNorma(LocalDate dataNorma) {
		this.dataNorma = dataNorma;
	}
}
