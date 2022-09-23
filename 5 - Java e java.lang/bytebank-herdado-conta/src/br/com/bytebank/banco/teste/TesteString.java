package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Mario";
		
		char c = nome.charAt(3);
		System.out.println(c);
		
		int pos = nome.indexOf("rio");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}
