package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		ContaCorrente cc2 = new ContaCorrente(22, 33);
		
		lista.add(cc1);
		
		boolean existe = lista.contains(cc1);
		
		System.out.println("jà existe? " + existe);
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
