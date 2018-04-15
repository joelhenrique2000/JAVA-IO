package br.com.algoritmos;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;

public class PercorrendoArquivosComSubPasta {
	
	public static void main(String args[]) {

        Path source = Paths.get("C:\\");
        try {
			Files.walkFileTree(source, new MyFileVisitor());
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
        
        MyFileVisitor.paths.forEach(System.out::println);

	}
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
	
	static LinkedList<Path> paths = new LinkedList<>();
	
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes){
        System.out.println("Nome do arquivo:" + path.getFileName());
    	paths.add(path);
        return FileVisitResult.CONTINUE;

    }
    
	  @Override
	  public FileVisitResult visitFileFailed(Path file, java.io.IOException e)
	      throws java.io.IOException {
	      //System.err.printf("Erro ao entrar no %s\n", file);
	
	      return FileVisitResult.SKIP_SUBTREE;
	  }
    
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes){
        //System.out.println("----------Nome do diretório:" + path + "----------");
    	
        return FileVisitResult.CONTINUE; 
    }
}


