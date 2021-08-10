package Curso01.javaBasico.lp;

public class ExercicooLacoAninhadosBreak {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				
				if(j > i) {
					break;
				}
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
