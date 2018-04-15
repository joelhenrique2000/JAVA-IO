package br.com.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileCheckEx {
	
	private static final String FILE_DIR = "C:\\test";
	private static final String FILE_TEXT_EXT = ".txt";
	
	public static void main(String[] args) {
		new FileCheckEx().deleteFile(FILE_DIR, FILE_TEXT_EXT);
	}
	
	public void deleteFile(String pasta, String extensao){
		
		GenericExtFilter filter = new GenericExtFilter(extensao);
		File file = new File(pasta);
		String[] list = file.list(filter);
		
		if(list.length == 0)return;
		
		File fileDelete;
		

		for (String dir : list ) {
			String temp = new StringBuffer(FILE_DIR).append(File.separator).append(dir).toString();
			fileDelete = new File(temp);
			boolean isdeleted = fileDelete.delete();
			System.out.println("Arquivo: "+ temp + " foram deletados " + isdeleted);
		}
	}
}


class GenericExtFilter implements FilenameFilter {

	private String extensao;
	
	public GenericExtFilter (String extensao) {
		this.extensao = extensao;
	}
	
	public boolean accept(File dir, String name) {
		return (name.endsWith(extensao));
	}
}
