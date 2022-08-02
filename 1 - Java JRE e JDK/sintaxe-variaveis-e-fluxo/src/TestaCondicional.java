
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 10;
		int quantidadePessoas = 1;
		
		if(idade >= 18) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("bem vindo");
		} else {
			//System.out.println("infelizmente você não pode entar");
			if(quantidadePessoas >= 2) {
				System.out.println("você não tem 18 mas pode entar"
						+ " pois está acompanhado");
			} else {
				System.out.println("infelizmente você nã pode entrar");
			}
		}
	}
}
