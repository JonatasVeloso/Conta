package br.com.jonatas.conta.testes;

import br.com.jonatas.conta.exeptions.SemSaldoExeption;
import br.com.jonatas.conta.objetos.ContaCorrente;
import br.com.jonatas.conta.objetos.ContaPoupanca;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100);
		
		try {
			cc.saca(20);
		}catch(SemSaldoExeption e){
			System.out.println(e);
		}
		
		cc.detalhes();
		
		cc.transfere(10, cp);
		cc.detalhes();
		cp.detalhes();
	}
}
