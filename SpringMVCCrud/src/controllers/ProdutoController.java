package controllers;

import modelo.Produto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/Produto")
public class ProdutoController implements CrudController<Produto> {

	@Override
	public ModelAndView adicionar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String adicionar(Produto arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView atualizar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Produto arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Produto arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView listar() {
		// TODO Auto-generated method stub
		return null;
	}

	


}