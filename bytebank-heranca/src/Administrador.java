
// Administrador é um funcionario, ou seja, herda da class Funcionario
// Administrador é um autenticavel, ou seja, implementa a interface Autenticavel

public class Administrador extends Funcionario implements Autenticavel{

	private Autenticador autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public double getBonificacao() {
		return 500;
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
