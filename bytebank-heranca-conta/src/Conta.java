

public abstract class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O bytebank tem um total de " + total + " contas");
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Criada a conta: " + this.numero);	
		
		if (agencia < 1) {
			throw new IllegalArgumentException("Agência inválida!");
		}
		
		if (numero < 1) {
			throw new IllegalArgumentException("Número de conta inválido");
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " | Valor a sacar:" + valor);
		} 
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); 
		destino.deposita(valor);		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O número da Conta deve ser maior que zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("O número da Agência deve ser maior que zero");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}


