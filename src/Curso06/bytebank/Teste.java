package Curso06.bytebank;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] idades = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		
		System.out.print("Idadees: ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		
		
	}

}
