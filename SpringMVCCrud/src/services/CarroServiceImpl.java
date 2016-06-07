package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.CarroRepository;
import modelo.Carro;

@Service
public class CarroServiceImpl implements CrudService<Carro, Integer> {

	
	private CarroRepository carroRepository;
	
	@Autowired
	public CarroServiceImpl(CarroRepository carroRepository) {
		this.carroRepository = carroRepository;
	}

	@Override
	public void adicionar(Carro carro) {
		carroRepository.saveAndFlush(carro);
		
	}

	@Override
	public void atualizar(Carro carro) {
		carroRepository.saveAndFlush(carro);
		
	}

	@Override
	public List<Carro> listar() {
		return carroRepository.findAll();
	}

	@Override
	public Carro encontrarPorId(Integer id) {
		return carroRepository.findOne(id);
	}

}
