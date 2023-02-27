package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		//Demonstrando que a "primeiraConta" não é o objeto em si,
		// e sim uma referência/link ao objeto
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		

		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		}
		
		// Aqui está o conteúdo da variável "primeiraConta",
		// como se fosse o endereço onde o objeto está guardado
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
