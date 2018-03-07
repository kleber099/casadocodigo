package br.com.casadocodigo.loja.infra;

import java.io.IOException;

import javax.servlet.http.Part;

public class FileSaver {

	public static final String SERVER_PATH = "C:/casadocodigo";

	public String write(Part arquivo, String path) {
		String relativePath = path + "/" + arquivo.getSubmittedFileName();
		
		try {
			arquivo.write(SERVER_PATH + "/" + relativePath);
			return relativePath;
		} catch (IOException e) {
			throw new RuntimeException();
		}
		
	}
}
