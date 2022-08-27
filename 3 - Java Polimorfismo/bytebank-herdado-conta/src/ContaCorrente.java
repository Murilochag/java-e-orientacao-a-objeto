
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}

	@Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
