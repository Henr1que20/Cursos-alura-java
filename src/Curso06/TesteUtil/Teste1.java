package Curso06.TesteUtil;

import java.util.ArrayList;
import java.util.List;

import Curso03.bytebank_herdado_conta.Conta;
import Curso03.bytebank_herdado_conta.ContaCorrente;
import Curso03.bytebank_herdado_conta.ContaPoupanca;

public class Teste1 {
	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
	}

}
