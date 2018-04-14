package br.com.file;

import java.io.File;
import java.io.IOException;

public class FilePermissionEx {
	public static void main(String[] args) {

		File file = new File("/test/shellscript.sh");

		if (file.exists()) {
			System.out.println("É possivel executar? " + file.canExecute());
			System.out.println("É possivel escrever? " + file.canWrite());
			System.out.println("É possivel ler? " + file.canRead());
		}
		
		file.setExecutable(false);
		file.setReadable(false);
		file.setWritable(false);
		
		System.out.println("É possivel executar? " + file.canExecute());
		System.out.println("É possivel escrever? " + file.canWrite());
		System.out.println("É possivel ler? " + file.canRead());
		
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
