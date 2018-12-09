package br.com.jonatas.conta.testes;

import java.util.ArrayList;

import br.com.jonatas.conta.objetos.Conta;
import br.com.jonatas.conta.objetos.ContaCorrente;
import br.com.jonatas.conta.objetos.ContaPoupanca;

public class TesteArrayList {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(11, 12);
		lista.add(cc);
		
		ContaPoupanca cp = new ContaPoupanca(22, 23);
		lista.add(cp);
		
		//Verifica tamanho da lista.
		//System.out.println("Tamanho: " + lista.size());
		
		//Conta ref = (Conta) lista.get(0);
		//System.out.println(ref.getAgencia());
		
		for(Object obj : lista) {
			System.out.println(obj);
		}
	}
}
