package org.chamado.controller;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.chamado.dao.ChamadoDAO;
import org.chamado.model.Chamado;
import org.chamado.model.Status;
import org.chamado.validation.ChamadoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ChamadoController {
	
	@Autowired
	private ChamadoDAO chamadoDao;
	
	@InitBinder
	public void initBider(WebDataBinder binder) {
		binder.addValidators(new ChamadoValidation());
	}
	
		
	@RequestMapping("/abrirchamado")
	public ModelAndView formChamado() {
		return new ModelAndView("/chamado/newformchamado");
	}
	
	@RequestMapping(value = "/meuschamados", method = RequestMethod.POST)
	@CacheEvict(value="listMeusChamado", allEntries=true)
	public ModelAndView gravar(@Valid Chamado chamado, BindingResult result ,RedirectAttributes redirectAttributes) {
		System.out.println(chamado.getTitulo()+"  "+chamado.getDescricao());
		if(result.hasErrors()) {
			return formChamado();
		}
		
		chamado.setStatus(Status.ABERTO);
		Calendar calendar = Calendar.getInstance();
		chamado.setData(calendar);
		System.out.println(chamado.getData());
		chamadoDao.gravar(chamado);
		redirectAttributes.addFlashAttribute("sucesso","Chamado foi aberto com sucesso!");
		ModelAndView view = new ModelAndView("redirect:/meuschamados");
		return view;
	}
	
	@RequestMapping(value = "/meuschamados", method=RequestMethod.GET)
	@Cacheable(value="listMeusChamado")
	public ModelAndView listar() {
		List<Chamado> chamados = chamadoDao.todosChamados();
		ModelAndView view = new ModelAndView("/chamado/meuschamados");
		view.addObject("chamados", chamados);
		return view;
	}
	
	@RequestMapping(value = "/meuchamado")
	public ModelAndView chamado( Integer numero) {
		ModelAndView view = new ModelAndView("/chamado/chamado");
		Chamado chamado = chamadoDao.find(numero);
		view.addObject("chamado", chamado);
		return view;
	}
}
