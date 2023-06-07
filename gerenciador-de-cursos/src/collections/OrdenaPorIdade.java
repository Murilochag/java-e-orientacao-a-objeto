package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OrdenaPorIdade implements Comparator<Funcionario> {
	

	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		return f1.getIdade() - f2.getIdade();
	}

}


