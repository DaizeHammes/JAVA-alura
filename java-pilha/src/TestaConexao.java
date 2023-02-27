
public class TestaConexao {

	public static void main(String[] args) {
		
		// Fazendo a abertura do try usando a interface AutoCloseable
		// já temos o finally implícito no objeto conexão
		
		try (Conexao conexao = new Conexao() ) {
			 conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão");
		}
		
		//-----------------------------------------------------------------
		//	Código legado - maneira antiga de tratar excessões de conexão
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			System.out.println("Finally");
//			if(con != null) {
//				con.close();
//			}
//		}
	}
}
