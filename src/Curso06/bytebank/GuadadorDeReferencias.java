package Curso06.bytebank;

import Curso03.bytebank_herdado_conta.Conta;

public class GuadadorDeReferencias {
	
	private Conta[] referencias;
	private int posicao;
	
	public GuadadorDeReferencias() {
		this.referencias = new Conta[10];
		this.posicao = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicao] = ref;
		this.posicao++;
	}
	
	public int getTamanho() {
		return posicao;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
	
	

}
