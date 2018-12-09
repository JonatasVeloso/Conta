package br.com.jonatas.conta.testes;

import br.com.jonatas.conta.objetos.Conta;
import br.com.jonatas.conta.objetos.ContaCorrente;
import br.com.jonatas.conta.objetos.ContaPoupanca;

public class TesteArrayConta {
	public static void main(String[] args) {
		Conta c[] = new Conta[5];
		ContaCorrente cc = new ContaCorrente(5, 3);
		ContaPoupanca cp = new ContaPoupanca(6, 3);
		
		for (int i = 0; i < c.length; i++) {
			if (i%2 == 0) {
				c[i] = new ContaCorrente(i,1);
			} else {
				c[i] = new ContaPoupanca(i,2);
			}
			System.out.println(c[i]);
		}		
	}
}
