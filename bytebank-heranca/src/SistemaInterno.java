
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		if(fa.autentica(this.senha)) {
			System.out.println("Usuário autenticado!");
		} else {
			System.out.println("Senha incorreta!");
		}
	}
}
