package Curso05.teste;

public class TesteString {
	public static void main(String[] args) {
		
		 /*
		  String nome  = "Henrique";
		 *
		 * 
		 * String teste = nome.replace("e", "E"); String teste2 = teste.replace("H",
		 * "h");
		 * 
		 * System.out.println(nome); System.out.println(teste);
		 * System.out.println(teste2);
		 * 
		 * String nome2 = "RiCaRdO"; System.out.println(nome2);
		 * 
		 * String letraMinustula = nome2.toLowerCase();
		 * System.out.println(letraMinustula);
		 * 
		 * String letraMaiuscula = letraMinustula.toUpperCase();
		 * System.out.println(letraMaiuscula);
		 */
		
		String nome = "Joaquim pereira da silva";
		System.out.println(nome.length());
		
		String estaProcurandoAlgumaCoisa = " ";
		
		System.out.println(estaProcurandoAlgumaCoisa.isEmpty());
		
		String vazio = "        vento      ";
		String estocarVento = vazio.trim();
		
		System.out.println(vazio);
		System.out.println(estocarVento);

		
		System.out.println(nome.contains("rei"));
		
		
		
		
	}

}
