package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestOrder{
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("murilo", 19);
		Funcionario f2 = new Funcionario("murilo adulto", 30);
		Funcionario f3 = new Funcionario("murilo cranca", 10);
		Funcionario f4 = new Funcionario("murilo bebe", 3);
		Funcionario f5 = new Funcionario("murilo velho", 60);
		
	
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		 
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		funcionarios.add(f4);
		funcionarios.add(f5);
		
		Iterator<Funcionario> iter = funcionarios.iterator();
		
		
		while (iter.hasNext()) {
			System.out.println( iter.next().getIdade());
		}
	}
	
}
