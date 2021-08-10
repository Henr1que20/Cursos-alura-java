package Curso03.bytebank_herdado_conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	@Override
	public String toString() {
		return "ContaCPoupanca, Numero: " + getNumero() + ", Agencia: " + getAgencia();
	}
}
