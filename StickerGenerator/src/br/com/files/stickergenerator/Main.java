package br.com.files.stickergenerator;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		var geradora = new FileStickerFactory();
		geradora.create();
	}

}
