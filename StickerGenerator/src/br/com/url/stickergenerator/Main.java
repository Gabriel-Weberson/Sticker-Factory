package br.com.url.stickergenerator;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		var geradora = new UrlStickerFactory();
		geradora.create();
	}

}
