
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Início do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			//System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Início do metodo2");
		
		throw new MinhaExcecao("Ops! Algo saiu errado...");
		
		//System.out.println("Fim do metodo2");
	}
}
