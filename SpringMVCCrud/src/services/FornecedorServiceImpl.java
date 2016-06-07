package services;

import java.util.List;

import org.springframework.stereotype.Service;

import repositories.FornecedorRepository;
import modelo.Fornecedor;

@Service
public class FornecedorServiceImpl implements CrudService<Fornecedor, Integer> {

	
	private FornecedorRepository fornecedorRepository; 
	@Override
	public void adicionar(Fornecedor arg) {
		fornecedorRepository.saveAndFlush(arg);
		
	}

	@Override
	public void atualizar(Fornecedor arg) {
		fornecedorRepository.saveAndFlush(arg);
		
	}

	@Override
	public List<Fornecedor> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fornecedor encontrarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
