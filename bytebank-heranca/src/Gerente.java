
// Gerente é um funcionario, ou seja, herda da class Funcionario
// Gerente é um autenticavel, ou seja, implementa a interface Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}