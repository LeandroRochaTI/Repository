package org.chamado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer matricula;
	private String nome;
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Departamento departamento;
	
	@OneToOne
	private Solucionador solucionador;
	
	@OneToOne
	private Solicitante solicitante;
	
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Solucionador getSolucionador() {
		return solucionador;
	}

	public void setSolucionador(Solucionador solucionador) {
		this.solucionador = solucionador;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
