package org.chamado.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.chamado.model.Chamado;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ChamadoDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void gravar(Chamado chamado) {
		entityManager.persist(chamado);
	}
	
	public List<Chamado> todosChamados(){
		return entityManager.createQuery("select c from Chamado c", Chamado.class).getResultList();
	}

	public Chamado find(Integer numero) {
		return entityManager.find(Chamado.class, numero);
	}
}
