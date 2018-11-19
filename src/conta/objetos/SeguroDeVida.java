package conta.objetos;

import conta.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

		
	@Override
	public double getValorImposto() {
		
		return 0;
	}
}
