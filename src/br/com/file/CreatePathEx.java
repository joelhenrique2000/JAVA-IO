package br.com.file;

import java.io.File;
import java.io.IOException;

public class CreatePathEx {
	
	public static void main(String[] args) {
		
		String fileName = "texto.txt";
		String workingDir = System.getProperty("user.dir"); //Pegar o caminho onde o programa está sendo executado
		String absoluteFilePath = "";
		
		absoluteFilePath = workingDir + File.separator + fileName;
		
		System.out.println("Caminho final: " + absoluteFilePath);
		
		File file = new File(absoluteFilePath);
		
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
