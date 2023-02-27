package bytebank;

public class TesteMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conseguiuRetirar);
		System.out.println(conta.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucesso = contaDaMarcela.transfere(300, conta);
		if (sucesso) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Falha na transferencia, verifique o saldo");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(conta.saldo);
	}
}
