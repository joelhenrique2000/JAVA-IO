package br.com.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteFIleEx {
	public static void main(String[] args) {
		
		File file = new File("C:\\test\\texto.txt");
		
		try {
			OutputStream is = new FileOutputStream(file,true);
			OutputStreamWriter osw = new OutputStreamWriter(is);
			BufferedWriter writer = new BufferedWriter(osw);

			writer.write("testestestesteste");
			writer.newLine();
			writer.write("testesteste");

			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
