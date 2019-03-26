package org.chamado.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ObservacaoChamado {
	
	@Id
	private Integer id;
	
	@ManyToOne
	private Chamado chamado;
	
	
	private String observacao;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Chamado getChamado() {
		return chamado;
	}


	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
