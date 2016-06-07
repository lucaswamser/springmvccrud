package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.tools.ws.wsdl.document.jaxws.Exception;

import repositories.UsuarioRepository;
import modelo.Usuario;

@Service
public class UsuarioServiceImpl implements CrudService<Usuario, Integer> {

	private UsuarioRepository usuarioRepository;
	
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
	

	public Usuario logar(String usuario, String senha){
		Usuario usuarioDb = usuarioRepository.findByUsuario(usuario);
		
		if (usuario == null){
			throw new IllegalAccessError("Usuário ou senha inválidos");
		}else{
			if (!usuarioDb.verificaSenha(senha))
				throw new IllegalAccessError("Usuário ou senha inválidos");
				
		}
		
		return usuarioDb;
	}
	
	@Override
	public void adicionar(Usuario arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Usuario arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario encontrarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
