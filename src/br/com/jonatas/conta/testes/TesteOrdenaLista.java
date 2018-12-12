package br.com.jonatas.conta.testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.jonatas.conta.objetos.Conta;
import br.com.jonatas.conta.objetos.ContaCorrente;

public class TesteOrdenaLista {
	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<>();
		
		Conta c1 = new ContaCorrente(1,1);
		c1.deposita(200);
		
		Conta c2 = new ContaCorrente(2, 1);
		c2.deposita(300);
		
		Conta c3 = new ContaCorrente(3, 1);
		c3.deposita(250);
		
		Conta c4 = new ContaCorrente(4, 1);
		c4.deposita(100);
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);	
		
		ContaComparator cc = new ContaComparator();
		lista.sort(cc);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
	
	
}

class ContaComparator implements Comparator<Conta>{
	@Override
	public int compare(Conta o1, Conta o2) {
		if(o1.getSaldo() < o2.getSaldo()) {
			return -1;
		}	
		if(o1.getSaldo() == o2.getSaldo()) {
			return 0;
		}
		return 1;
	}
}


