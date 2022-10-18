package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquais {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 11);
//		
//		boolean engual = cc1.ehIgual(cc2);
//		System.out.println(engual);
		
		
		
		// generics
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 33);
		
		boolean existe = lista.contains(cc2);
		
		System.out.println("já existe? " + existe);
	
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
