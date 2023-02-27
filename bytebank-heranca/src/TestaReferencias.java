
public class TestaReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000.0);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(gerente);
		controleBonificacao.registra(editorVideo);
		
		System.out.println(controleBonificacao.getSoma());
	}
}
