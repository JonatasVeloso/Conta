package br.com.jonatas.conta.testes;

import br.com.jonatas.conta.exeptions.SemSaldoExeption;
import br.com.jonatas.conta.objetos.ContaCorrente;

public class TesteSaca {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(200);
		System.out.println(cc);
		try {
			cc.saca(200);	
		}catch(SemSaldoExeption e){
			System.out.println(e.getMessage());
		}

		System.out.println(cc);
	}
}
