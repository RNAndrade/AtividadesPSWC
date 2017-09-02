package atividade04.basic;

public class Usuario {

	private Integer codigo;
	private String login;
	private String senha;
	private String nome;
	private String email;

	public Usuario() {
		super();
	}

	public Usuario(Integer codigo, String login, String senha) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
	}

	public Usuario(Integer codigo, String login, String senha, String nome, String email) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Código: " + this.getCodigo() + " Nome: " + this.getNome() + " Login: " + this.getLogin() + "Senha: " + this.getSenha();
	}
}
