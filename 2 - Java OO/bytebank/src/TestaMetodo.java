
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaMurilo = new Conta();
		
		contaMurilo.saldo = 1000.00;
		contaMurilo.agencia = 3040;
		contaMurilo.numero = 24899;
		
		Conta contaPaula = new Conta();
		contaPaula.saldo = 3000;
		contaPaula.agencia = 3040;
		contaPaula.numero = 32749;
		
		System.out.println(contaMurilo.verSaldo()); 
		System.out.println(contaMurilo.saca(200));
		//System.out.println(contaMurilo.deposita(100));// não funciona por não retorna nada
		System.out.println(contaMurilo.transfere(30, contaPaula));
	}
}
