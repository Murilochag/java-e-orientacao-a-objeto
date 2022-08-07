
public class TestarConta {
	public static void main(String[] args) {
		
		Cliente murilo = new Cliente();
		murilo.setCpf("02498864210");
		murilo.setNome("murilo das chagas de carvalho");
		murilo.setProfissao("programador");
		
		
		Conta conta = new Conta();
		conta.setAgencia(3040);
		conta.setNumero(824988642);
		conta.setSaldo(400);
		conta.setTitular(murilo);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		System.out.println(conta.getTitular().getNome());
	}
}
