package br.com.chamado.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Solucionador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idSolucionador;
	
	@OneToMany
	private List<Chamado> chamados;
	
	@OneToOne
	private Funcionario funcionario;
	

	public Integer getIdSolucionador() {
		return idSolucionador;
	}

	public void setIdSolucionador(Integer idSolucionador) {
		this.idSolucionador = idSolucionador;
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
