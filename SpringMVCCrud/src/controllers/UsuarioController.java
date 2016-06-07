package controllers;
import javax.servlet.http.HttpSession;

import modelo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import services.UsuarioServiceImpl;

@Controller
@RequestMapping(value="/Usuario")
public class UsuarioController implements CrudController<Usuario> {

	@Autowired
	private UsuarioServiceImpl usuarioService;
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public ModelAndView loginPage(HttpSession session) {
		if (session.getAttribute("usuarioLogado") != null){
			return new ModelAndView("redirect:/Home/");
		}
		ModelAndView view = new ModelAndView("usuario.login");
		return view;
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
    public ModelAndView logar(@RequestParam(value="usuario") String usuario,@RequestParam(value="senha") String senha, HttpSession session) {
	
		try{
			session.setAttribute("usuarioLogado", usuarioService.logar(usuario, senha));
			return new ModelAndView("redirect:/Home/");
		}catch(IllegalAccessError e){	
		}
		return new ModelAndView("usuario.login");
    }
	
	
	@RequestMapping(value="logout",method = RequestMethod.GET)
    public String logout(HttpSession session) {
    	session.removeAttribute("usuarioLogado");		
		return  "redirect:/";
    }

	@Override
	public ModelAndView adicionar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String adicionar(Usuario arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView atualizar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Usuario arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Usuario arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView listar() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}