
public class TestaSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(132, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo Insuficiente! | " + e.getMessage());
		}

		
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
