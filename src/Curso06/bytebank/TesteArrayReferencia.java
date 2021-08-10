package Curso06.bytebank;

import Curso03.bytebank_herdado_conta.Cliente;
import Curso03.bytebank_herdado_conta.ContaCorrente;
import Curso03.bytebank_herdado_conta.ContaPoupanca;

public class TesteArrayReferencia {
	
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		Object[] referencias = new Object[5]; 
		
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		
		referencias[1] = cc2;
				
		Cliente cliente = new Cliente();
		
		referencias[2] = cliente;
		
		//System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
