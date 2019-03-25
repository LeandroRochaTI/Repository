package br.com.chamado.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chamado {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numero;
	private String titulo;
	private String descricao;
	
	@OneToMany
	private List<Observacoes> observacoes;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numeroChamado) {
		this.numero = numeroChamado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String tituloChamdo) {
		this.titulo = tituloChamdo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricaoChamado) {
		this.descricao = descricaoChamado;
	}
	public List<Observacoes> getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(List<Observacoes> observacoes) {
		this.observacoes = observacoes;
	}
	
	

}
