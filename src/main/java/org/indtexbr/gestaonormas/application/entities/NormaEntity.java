package org.indtexbr.gestaonormas.application.entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class NormaEntity {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Type(type="uuid-char")
	@GeneratedValue(generator = "uuid2")
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
