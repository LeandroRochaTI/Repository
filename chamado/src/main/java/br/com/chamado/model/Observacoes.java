package br.com.chamado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Observacoes {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idObservacoes;
	private String Observacoes;
	
	public Integer getIdObservacoes() {
		return idObservacoes;
	}
	public void setIdObservacoes(Integer idObservacoes) {
		this.idObservacoes = idObservacoes;
	}
	public String getObservacoes() {
		return Observacoes;
	}
	public void setObservacoes(String observacoes) {
		Observacoes = observacoes;
	}
	
	
}
