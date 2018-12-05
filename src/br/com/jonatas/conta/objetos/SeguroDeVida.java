package br.com.jonatas.conta.objetos;

import br.com.jonatas.conta.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

		
	@Override
	public double getValorImposto() {
		
		return 0;
	}
}
