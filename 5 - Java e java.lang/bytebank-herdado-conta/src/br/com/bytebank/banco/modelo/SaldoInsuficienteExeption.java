package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteExeption extends Exception{

	public SaldoInsuficienteExeption(String msg) {
		super(msg);
	}
}
