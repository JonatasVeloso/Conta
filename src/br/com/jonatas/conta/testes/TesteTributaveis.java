package br.com.jonatas.conta.testes;

import br.com.jonatas.conta.CalculadorDeImposto;
import br.com.jonatas.conta.objetos.ContaCorrente;
import br.com.jonatas.conta.objetos.SeguroDeVida;

public class TesteTributaveis {
	public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registro(cc);
        calc.registro(seguro);

        System.out.println(calc.getTotalImposto());
    }
}

