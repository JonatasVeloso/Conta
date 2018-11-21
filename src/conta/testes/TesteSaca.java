package conta.testes;

import conta.exeptions.SemSaldoExeption;
import conta.objetos.ContaCorrente;

public class TesteSaca {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(200);
		cc.detalhes();
		try {
			cc.saca(200);	
		}catch(SemSaldoExeption e){
			System.out.println(e.getMessage());
		}

		cc.detalhes();
	}
}
