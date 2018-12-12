package br.com.jonatas.conta.testes;

import br.com.jonatas.conta.objetos.Conta;
import br.com.jonatas.conta.objetos.ContaCorrente;
import br.com.jonatas.conta.repositories.ContaDAO;

public class TesteAdiciona {
	public static void main(String[] args) {
		ContaDAO dao = new ContaDAO();
		
		Conta conta = new ContaCorrente(1,1);
		
		dao.adiciona(conta);
		
	}
}
