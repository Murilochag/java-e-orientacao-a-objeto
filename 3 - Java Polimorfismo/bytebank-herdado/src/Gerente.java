
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

	
	//public void setSenha(int senha) {
	//	this.senha = senha;
	//}
	public double getBonificacao(){
	    return 200.0;
	}
}
