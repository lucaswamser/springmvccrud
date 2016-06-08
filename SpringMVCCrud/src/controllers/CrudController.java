package controllers;

import javax.websocket.server.PathParam;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public interface CrudController<E> {
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public ModelAndView adicionar();
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String adicionar(E arg, BindingResult result);
	@RequestMapping(value="/edit/{id}",method = RequestMethod.GET)
	public ModelAndView atualizar(@PathVariable("id") String id);
	@RequestMapping(value="/edit/{id}",method = RequestMethod.POST)
	public String atualizar(E arg, BindingResult result);
	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
	public String apagar(String id);
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView listar();
	

}
