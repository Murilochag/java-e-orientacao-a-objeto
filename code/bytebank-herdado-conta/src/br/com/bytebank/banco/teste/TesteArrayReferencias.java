package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22, 33);
		contas[1] = cc2;
		
		
		System.out.println(contas[0].getNumero());
		
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		
	}
}
