package org.chamado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioControler {

	@RequestMapping("/perfil")
	public ModelAndView perfil() {
		return new ModelAndView("/user/perfil");
	}
	
	@RequestMapping("/configuracoes")
	public ModelAndView configuracoes() {
		return new ModelAndView("/user/configuracao");
	}
}
