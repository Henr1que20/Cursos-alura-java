package Curso01.javaBasico.lp;

public class TesteIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario = 3300.0;

		if (salario > 1900.0 && salario < 2800.0) {
			System.out.println("A sua aliquota � de 7.5%");
			System.out.println("Voc� pode deduzir at� R$ 142");
		}else if (salario < 3751.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350");
		}else if (salario < 4664.0) {
			System.out.println("A sua aliquota � de 22,5%");
			System.out.println("Voc� pode deduzir at� R$ 636");
		}

	}

}