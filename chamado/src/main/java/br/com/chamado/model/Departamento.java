package br.com.chamado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDepartamento;
	private String nomeDepartamento;
	private Integer centroDeCusto;
	
	
	
	public Integer getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public Integer getCentroDeCusto() {
		return centroDeCusto;
	}
	public void setCentroDeCusto(Integer centroDeCusto) {
		this.centroDeCusto = centroDeCusto;
	}
	
	
}
