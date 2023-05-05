package br.com.files.stickergenerator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class FileStickerFactory {


	public void create() throws IOException {
		
		// Leitura da imagem
		InputStream inputStream = new FileInputStream(new File("imagens/imagem.jpg"));
		BufferedImage ImagemOriginal = ImageIO.read(inputStream);

		// Cria uma nova imagem em memoria com a transparencia e com novo tamanho
		int largura = ImagemOriginal.getWidth();
		int altura = ImagemOriginal.getHeight();
		int novaAltura = altura + 200;
		BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

		// Copia a imagem original pra nova imagem em memória
		Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
		graphics.drawImage(ImagemOriginal, 0, 0, null);
		
		// Atribui a fonte e o tamanho do texto
		var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 57);
		graphics.setColor(Color.YELLOW);
		graphics.setFont(fonte);
		
		// Escreve um texto na nova imagem
		String frase1 = "QUANDO O CÓDIGO RODA";
		String frase2 = "SEM NENHUM BUG";
		graphics.drawString(frase1, 0, novaAltura-110);
		graphics.drawString(frase2, 83, novaAltura-50);
		
		// Escreve a nova imagem em um arquivo
		ImageIO.write(novaImagem, "png", new File("stickers/stickerByFile.png"));

	}
	

}
