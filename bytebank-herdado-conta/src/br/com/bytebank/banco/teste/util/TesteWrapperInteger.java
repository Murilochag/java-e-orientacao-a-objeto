package br.com.bytebank.banco.teste.util;

import java.util.*;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		Integer idadeRef = 29; //autoboxing, é criado um objeto do tipo Integer
		
		int primitivo = new Integer(21);// unboxing
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef);
		lista.add(primitivo);
		
		
		int i1 = lista.get(0);
		Integer i2 = lista.get(1);
		
		System.out.println(i1);
		System.out.println(i2);
		
		
		Integer valorRef = Integer.valueOf(33); // delegando a criação para metodo valueOf
		int valorPri = valorRef.intValue(); // desembrulhando, pegando o valor primitivo do objeto wrapper
		
		System.out.println(valorPri); //33
		
		
		Integer iParseado1 = Integer.valueOf("42");
		int iParseado2 = Integer.parseInt("44");
		
		System.out.println(iParseado1);
		System.out.println(iParseado2);
		
		//verificar constantes da classe
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

	}

}
