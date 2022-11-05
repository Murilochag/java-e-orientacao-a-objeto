package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
	public static void main(String[] args) throws IOException {

		
		PrintStream ps = new PrintStream("arquivo2.txt");
		
		
		ps.println("Que eu me torne em todos os momentos, agora e para sempre,");
		ps.print("Um protetor para os sem proteção,");

		ps.close();
		
		PrintWriter pw = new PrintWriter("arquivo2.txt");
		
		pw.println("Que eu me torne em todos os momentos, agora e para sempre,");
		pw.print("Um protetor para os sem proteção,");
		
		pw.close();
		
		// 

	}
}
