package br.com.file;

import java.io.File;

public class DeleteFileEx {
	public static void main(String[] args) {
		
		File file = new File("/test/shellscript.sh");
		
		if(file.delete()) {
			System.out.println("Arquivo deletado!");
		}else {
			System.out.println("Arquivo não foi encotrado ou executado");
		}
		
	}
}
