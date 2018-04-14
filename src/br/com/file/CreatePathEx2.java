package br.com.file;

import java.io.File;
import java.io.IOException;

public class CreatePathEx2 {

	public static void main(String[] args) {
		
		String fileName = "texto.txt";
		String workingDir = System.getProperty("user.dir");
		
		File file = new File(workingDir , fileName);
		
		System.out.println("Caminho final: " + file.getAbsolutePath());
		
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
