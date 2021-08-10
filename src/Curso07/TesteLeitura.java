package Curso07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("teste.txt"); 
		
		Reader isr = new InputStreamReader(file); 
		
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		System.out.println(br.ready());
		
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();			
		}
		
		
		
		br.close();
	}
}
