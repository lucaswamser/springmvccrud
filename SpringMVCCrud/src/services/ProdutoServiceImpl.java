package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.ProdutoRepository;
import modelo.Produto;

@Service
public class ProdutoServiceImpl implements CrudService<Produto, Integer> {

	private ProdutoRepository produtoRepository;
	
	
	@Autowired
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}
	

	@Override
	public void adicionar(Produto produto) {
		produtoRepository.saveAndFlush(produto);
		
	}

	@Override
	public void atualizar(Produto produto) {
		produtoRepository.saveAndFlush(produto);
	}


	@Override
	public List<Produto> listar() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto encontrarPorId(Integer id) {
		// TODO Auto-generated method stub
		return produtoRepository.findOne(id);
	}

	@Override
	public void remover(Integer id) {
		produtoRepository.delete(id);
		
	}

}
