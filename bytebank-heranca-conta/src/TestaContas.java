
public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(1111, 11111);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(2222, 22222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
