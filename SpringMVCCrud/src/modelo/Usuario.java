package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlTransient;
@Entity
public class Usuario{
	@Id @GeneratedValue private Integer idUsuario;
	private String nome;
	// @NotNull
	// @Size(min=5, message="O usuario não pode ter menos que 5 caracteres!")
	// Column(unique=true)
	private String usuario;
	@XmlTransient
	private String senha;
	private Boolean ativo;

	public Usuario() {
		super();
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	
	public void setUsuario(String usuario){
				this.usuario = usuario;
		
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean verificaSenha(String senha){
		return senha.equals(this.senha);
	}

}
