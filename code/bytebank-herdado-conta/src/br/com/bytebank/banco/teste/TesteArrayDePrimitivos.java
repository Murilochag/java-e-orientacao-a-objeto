package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5];
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade4 = idades[3];
		
		System.out.println(idade4);
		System.out.println(idades.length);
		
		int[] idades2 = new int[5];
		
		for(int i = 0; i < idades2.length; i++) {
			idades2[i] = i * i;
		}
		for(int i = 0; i < idades2.length; i++) {
			System.out.println(idades2[i]);
		}
		
		// array literal
		int[] numeros = {1,2,3,4,5};
		System.out.println(numeros[2]);

	}

}
