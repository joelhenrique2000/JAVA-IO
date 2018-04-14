package br.com.file;

import java.io.File;
import java.io.IOException;

public class CreateFileEx3 {
	public static void main(String[] args) {
		
		String filename = "test.txt";
		String workingDir = System.getProperty("user.dir");
		String absolutePath = "";
		
		String meu_OS = System.getProperty("os.name").toLowerCase();
		
		// Windows
		if(meu_OS.indexOf("win") >= 0) {
			absolutePath = workingDir + "\\" + filename;
		// Unix, Linux e Mac
		}else if(meu_OS.indexOf("nix") >= 0 || meu_OS.indexOf("mac") >= 0 || meu_OS.indexOf("nux") >= 0){
			absolutePath = workingDir = "/" + filename;
		}
		
		File file = new File(absolutePath);
		
		System.out.println("Caminho final: " + absolutePath);
		
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
