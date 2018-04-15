package br.com.algoritmos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PercorrendoArquivosSemSubPasta {
	public static void main(String[] args) {
		for(File file : percorrendoArquivos(new File("C:\\"))) {
			System.out.println(file);
		}
	}
	
	public static List<File> percorrendoArquivos(File dir) {
		
		List<File> files = new ArrayList<>();

		for(File path : dir.listFiles()) {
			if(!path.isDirectory()) files.add(path);
		}
		
		return files;
		
	}
}
	

