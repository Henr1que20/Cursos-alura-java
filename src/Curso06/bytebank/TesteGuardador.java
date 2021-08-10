package Curso06.bytebank;

import Curso03.bytebank_herdado_conta.Conta;
import Curso03.bytebank_herdado_conta.ContaCorrente;

public class TesteGuardador {
	public static void main(String[] args) {
		
		GuadadorDeReferencias guadador = new GuadadorDeReferencias();
		
		Conta cc = new ContaCorrente(22, 11);
		
		guadador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);

		
		guadador.adiciona(cc2);
		
		int tamanho = guadador.getTamanho();
		System.out.println(tamanho);
		
		Conta ref = guadador.getReferencia(0);
		
		
		
	}

}
