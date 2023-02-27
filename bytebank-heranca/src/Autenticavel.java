
// Uma interface, pode ser entendida como uma classe abstrata.
// Ela não pode ter atributos e nem métodos concretos. 
// Obrigando as classes que a implementam a terem seus próprios métodos concretos.
// 		Exemplo: A interface seria como um contrato autenticavel.
//		Quem assina esse contrato, precisa implementar:
//			metodo setSenha
//			metodo autentica

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
