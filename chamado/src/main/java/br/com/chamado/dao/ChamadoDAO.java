package br.com.chamado.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.chamado.model.Chamado;

@Repository
@Transactional
public class ChamadoDAO {
	
	
	
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Chamado chamado) {
		manager.persist(chamado);
	}
	
	public List<Chamado> listarChamados() {
		return manager.createQuery("select c from Chamado c", Chamado.class).getResultList();
	}

}
