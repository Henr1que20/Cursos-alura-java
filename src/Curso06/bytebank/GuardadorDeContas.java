package Curso06.bytebank;

public class GuardadorDeContas {

	private Object[] referencias;
	private int posicao;
	
	public GuardadorDeContas() {
		this.referencias = new Object[10];
		this.posicao = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicao] = ref;
		this.posicao++;
	}
	
	public int getTamanho() {
		return this.posicao;
	}
	
	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
