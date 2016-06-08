package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.FornecedorRepository;
import modelo.Fornecedor;

@Service
public class FornecedorServiceImpl implements CrudService<Fornecedor, Integer> {

	@Autowired
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
		return fornecedorRepository.findAll();
	}

	@Override
	public Fornecedor encontrarPorId(Integer id) {
		return fornecedorRepository.findOne(id);
	}

	@Override
	public void remover(Integer id) {
		fornecedorRepository.delete(id);
		
	}

}
