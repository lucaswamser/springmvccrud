package controllers;

import java.util.List;

import javax.swing.text.View;
import javax.validation.Valid;

import modelo.Carro;
import modelo.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import services.ProdutoServiceImpl;

@Controller
@RequestMapping(value = "/Produto")
public class ProdutoController implements CrudController<Produto> {

	@Autowired
	private ProdutoServiceImpl produtoService;
	@Override
	public ModelAndView adicionar() {
		ModelAndView  view = new ModelAndView("produto.form");
		view.addObject("produto", new Produto());
		return view;
	}

	@Override
	public String adicionar(@Valid Produto produto, BindingResult result) {
		if(!result.hasErrors()){
		produtoService.adicionar(produto);
		return "redirect:/Produto/";
		}
		return "produto.form";
		
	}

	@Override
	public ModelAndView atualizar(@PathVariable("id") String id) {
		ModelAndView  view = new ModelAndView("produto.form");
		view.addObject("produto", produtoService.encontrarPorId(Integer.valueOf(id)));
		return view;
	}

	@Override
	public String atualizar(@Valid Produto produto, BindingResult result) {
		if (!result.hasErrors()){
		produtoService.atualizar(produto);
		return "redirect:/Produto/";
		}
		return "produto.form";
	}


	@Override
	public ModelAndView listar() {
		ModelAndView  view = new ModelAndView("produto.lista");
		view.addObject("produtos", produtoService.listar());
		return view;
	}

	@Override
	public String apagar(@PathVariable("id") String id) {
		produtoService.remover(Integer.valueOf(id));
		return "redirect:/Produto/";
	}

	@RequestMapping(value="/json/list",method = RequestMethod.GET)
	public @ResponseBody List<Produto> listarJson(){
		return produtoService.listar();
	}
	


}