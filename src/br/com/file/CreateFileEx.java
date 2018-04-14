package br.com.file;

import java.io.File;
import java.io.IOException;

public class CreateFileEx {

	public static void main(String[] args) {
		
		File file = new File("C:\\JAVA IO\\TEXT.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("Arquivo criado com sucesso!");
			}else {
				System.out.println("Arquivo já criado!");
			}
		} catch (IOException e) {
			System.out.println("Erro ao criar o arquivo!");
			e.printStackTrace();
		}
		
	}
	
}
