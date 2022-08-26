
public class TesteSistema {

	public static void main(String[] args) {
		Gerente murilo = new Gerente();
		
		murilo.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(murilo);

	}

}
