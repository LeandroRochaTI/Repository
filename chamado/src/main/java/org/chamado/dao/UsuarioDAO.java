package org.chamado.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.chamado.model.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAO implements UserDetailsService{
	
	@PersistenceContext
	private EntityManager manager;
	
	public Usuario loadUserByUsername(String email) {
		List<Usuario> usuarios = manager.createQuery("select u from Usuario u where u.email = :email", Usuario.class)
			.setParameter("email", email)
			.getResultList();
		
		if(usuarios.isEmpty()) {
			throw new UsernameNotFoundException("");
		}
		
		return usuarios.get(0);
	}

}

