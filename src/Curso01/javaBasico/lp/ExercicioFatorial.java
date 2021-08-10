package Curso01.javaBasico.lp;

public class ExercicioFatorial {

	public static void main(String[] args) {
		int fat = 6;
		int n = fat;
		fat = 1;

		for (int i = n; i > 1; i--) {

			fat = fat * i;
		}

		System.out.println(n + "! = " + fat);
	}
}
