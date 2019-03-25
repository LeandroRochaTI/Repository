package br.com.chamado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.chamado.dao.ChamadoDAO;
import br.com.chamado.model.Chamado;

@Controller
public class ChamadoController {
	
	@Autowired
	private ChamadoDAO chamadoDao;

	@RequestMapping("/abrirchamado")
	public String formChamado() {
		System.out.println("teste form controller");
		return "/chamado/formchamado";
	}
	
	@RequestMapping(value="/meuschamados", method=RequestMethod.POST)
	public String gravar(String titulo, String descricao) {
		Chamado chamado = new Chamado();
		chamado.setTitulo(titulo);
		chamado.setDescricao(descricao); 
		chamadoDao.gravar(chamado);
		return "/chamado/listmychamados";
	}
	
	@RequestMapping(value="/meuschamados", method=RequestMethod.GET)
	public ModelAndView listarChamado() {
		List<Chamado> chamados = chamadoDao.listarChamados();
		for (Chamado chamado : chamados) {
			System.out.println(chamado.getTitulo());
		}
		ModelAndView modelAndView = new ModelAndView("/chamado/listchamados");
		modelAndView.addObject("chamados",chamados);
		return modelAndView;
	}
	
	@RequestMapping("/meuchamado")
	public ModelAndView find() {
		
		return new ModelAndView();
	}
}
