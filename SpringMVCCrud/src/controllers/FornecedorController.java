package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import modelo.Fornecedor;

@Controller
@RequestMapping(value="/Fornecedor")
public class FornecedorController implements CrudController<Fornecedor> {

	@Override
	public ModelAndView adicionar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String adicionar(Fornecedor arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView atualizar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Fornecedor arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Fornecedor arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView listar() {
		// TODO Auto-generated method stub
		return null;
	}



	


}