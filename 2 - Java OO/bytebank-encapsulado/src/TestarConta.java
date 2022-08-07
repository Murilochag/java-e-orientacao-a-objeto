
public class TestarConta {
	public static void main(String[] args) {
		
		Cliente murilo = new Cliente();
		murilo.setCpf("02498864210");
		murilo.setNome("murilo das chagas de carvalho");
		murilo.setProfissao("programador");
		
		Conta conta0 = new Conta(3040, 96051904);
		System.out.println(conta0);
		Conta conta1 = new Conta(3040, 96051904);
		conta1.setSaldo(400);
		conta1.setTitular(murilo);
		
		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getSaldo());
		System.out.println(conta1.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
	}
}
