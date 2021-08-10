package Curso06.TesteUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Curso03.bytebank_herdado_conta.Conta;
import Curso03.bytebank_herdado_conta.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		
		List <Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
	
		
		for (Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("ja tenho essa conta");
			}
		}
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Ja existe? " + existe);
	}

}
