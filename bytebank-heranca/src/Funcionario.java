// Classe abstrata (abstract), não permite que se instancie nenhum objeto.
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	// Método sem corpo (abstract), não implementado na classe
	// A função dele é direcionar para o método identico nas classes filhas
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
