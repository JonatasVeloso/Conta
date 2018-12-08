package br.com.jonatas.conta.testes;

import br.com.jonatas.conta.objetos.Conta;
import br.com.jonatas.conta.objetos.ContaCorrente;
import br.com.jonatas.conta.objetos.ContaPoupanca;

public class TesteArrayConta {
	public static void main(String[] args) {
		Conta c[] = new Conta[5];
		ContaCorrente cc = new ContaCorrente(3, 3);
		ContaPoupanca cp = new ContaPoupanca(4, 4);
		
		for (int i = 0; i < c.length; i++) {
			if (i%2 == 0) {
				c[i] = new ContaCorrente(1,1);
			} else {
				c[i] = new ContaPoupanca(2,2);
			}
			c[i].detalhes();
			cc.detalhes();
			cp.detalhes();
		}		
	}
}
