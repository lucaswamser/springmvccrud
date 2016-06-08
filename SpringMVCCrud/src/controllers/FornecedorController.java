package controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import services.FornecedorServiceImpl;
import modelo.Fornecedor;

@Controller
@RequestMapping(value="/Fornecedor")
public class FornecedorController implements CrudController<Fornecedor> {

	@Autowired
	private FornecedorServiceImpl fornecedorService;
	
	@Override
	public ModelAndView adicionar() {
		ModelAndView view = new ModelAndView("fornecedor.form");
		view.addObject("fornecedor", new Fornecedor());
		return view;
	}

	@Override
	public String adicionar(@Valid Fornecedor fornecedor, BindingResult result) {
		if (!result.hasErrors()){
			fornecedorService.adicionar(fornecedor);
			return "redirect:/Fornecedor/";
		}
		
		return "fornecedor.form";
	}

	@Override
	public ModelAndView atualizar(@PathVariable String id) {
		ModelAndView view = new ModelAndView("fornecedor.form");
		view.addObject("fornecedor", fornecedorService.encontrarPorId(Integer.valueOf(id)));
		return view;
	}

	@Override
	public String atualizar(@Valid Fornecedor fornecedor, BindingResult result) {
		if (!result.hasErrors()){
			fornecedorService.atualizar(fornecedor);
			return "redirect:/Fornecedor/";
		}
		
		return "fornecedor.form";
	}



	@Override
	public ModelAndView listar() {
		ModelAndView view = new ModelAndView("fornecedor.lista");
		view.addObject("fornecedores", fornecedorService.listar());
		return view;
	}

	@Override
	public String apagar(@PathVariable String id) {
		fornecedorService.remover(Integer.valueOf(id));
		return "redirect:/Fornecedor/";
	}



	


}