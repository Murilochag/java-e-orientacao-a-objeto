
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel au) {
		boolean autenticou = au.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("pode entrar");
		} else {
			System.out.println("não pode entrar");
		}
	}
	
}
