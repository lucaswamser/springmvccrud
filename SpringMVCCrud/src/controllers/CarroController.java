package controllers;

import java.net.URL;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.xml.xsom.impl.util.Uri;

import services.CarroServiceImpl;
import modelo.Carro;

@Controller
@RequestMapping(value="/Carro")
public class CarroController implements CrudController<Carro> {

	@Autowired
	private CarroServiceImpl carroService;
	

	@Override
	public ModelAndView adicionar() {
		ModelAndView view = new ModelAndView("carro.form");
		view.addObject("carro", new Carro());
		return view;
	}

	@Override
	public String adicionar(@Valid Carro carro, BindingResult result) {
		if (!result.hasErrors()){
		carroService.adicionar(carro);
		return "redirect:/Carro/";
		}
		return "carro.form";
	}

	@Override
	public ModelAndView atualizar(@PathVariable("id") String id) {
		ModelAndView view = new ModelAndView("carro.form");
		view.addObject("carro", carroService.encontrarPorId(Integer.valueOf(id)));
		return view;
	}

	@Override
	public String atualizar(@Valid Carro carro, BindingResult result) {
		if (!result.hasErrors()){
		carroService.atualizar(carro);
		return "redirect:/Carro/";
		}
		return "carro.form";
	}


	@Override
	public ModelAndView listar() {
		// TODO Auto-generated method stub
		return new ModelAndView("carro.lista");
	}
	

	@Override
	public String apagar(@PathVariable("id") String id) {
		carroService.remover(Integer.valueOf(id));
		return "redirect:/Carro/";
	}
	
	@RequestMapping(value="/json/list",method = RequestMethod.GET)
	public @ResponseBody List<Carro> listarJson(){
		return carroService.listar();
	}
	
}