package Curso06.TesteUtil;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes  = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		
		
		String s = "10";
		
		int numero = Integer.parseInt(s);
		System.out.println(s + 1);
		System.out.println(numero + 1);
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
	}

}
