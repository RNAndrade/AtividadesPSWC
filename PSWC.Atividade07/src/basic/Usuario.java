package basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario implements IUsuario{

	@Id
	@GeneratedValue
	private Long id;
	private String login;
	private String senha;
	
	public Usuario() {
	}
	
	public Usuario(String login, String senha){
        this.setLogin(login);
        this.setSenha(senha);
    }

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
