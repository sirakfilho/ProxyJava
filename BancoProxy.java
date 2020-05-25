package model;
public class BancoProxy extends BancoUsuarios {

	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getUsuario() {
		if (temPermissaoDeAcesso()) {
			return super.getUsuario();
		}
		return "usuario incorreto";
	}

	@Override
	public String getSenha() {
		if (temPermissaoDeAcesso()) {
			return super.getSenha();
		}
		return "senha incorreta";
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
