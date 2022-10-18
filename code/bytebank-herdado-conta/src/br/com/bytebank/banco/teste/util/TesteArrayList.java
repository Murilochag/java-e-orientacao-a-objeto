package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(1);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(38, 22);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(84, 22);
		lista.add(cc4);
		
		
		for(int i = 0; i< lista.size();i++) {
			Object ref2 = lista.get(i);
			System.out.println(ref2);
		}
		
		System.out.println("------------");
		
		for(Object ref2 : lista) {
			System.out.println(ref2);
		}
	}

}
