package services;

import java.util.List;

public interface CrudService<E,ID> {
	
	
	public void adicionar(E arg);
	public void atualizar(E arg);
	public E encontrarPorId(ID id);
	public void remover(ID id);
	public List<E> listar();
	

}
