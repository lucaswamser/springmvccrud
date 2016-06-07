package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Carro {
	@Id @GeneratedValue private Integer idCarro;
	@NotNull
	@Size(min=5, message="O nome não pode ter menos que 5 caracteres!")
	private String modelo;
	private Integer ano;
	private String cor;
	private Integer quilometragem;
	
	public Carro() {
		super();
	}
	public Carro(String modelo, Integer ano, String cor, Integer quilometragem) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.quilometragem = quilometragem;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	
	public Integer getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}
	@Override
	public String toString() {
		return "Carro [idCarro=" + idCarro + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + ", quilometragem="
				+ quilometragem + "]";
	}

	
	
	
	
	
	
}
