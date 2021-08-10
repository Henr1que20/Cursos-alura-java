package Curso07;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		OutputStream fis = new FileOutputStream("teste.txt");
		
		Writer isr = new OutputStreamWriter(fis);
		
		BufferedWriter bw = new BufferedWriter(isr);
		
		
		
		
		bw.write("ola meu nome e henrique ");
		bw.newLine();
		bw.newLine();
		bw.write("ola meu nome e joviscleiton ");
		
		bw.close();
	}

}
