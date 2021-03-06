package agente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class tela extends JFrame {
	JFrame Janela = new JFrame();
	JPanel painel;
	
	public tela() {
		super("Agente Marte");
		Janela.setMinimumSize(new Dimension(800,600));
		Janela.setMaximumSize(new Dimension(800,600));
		Janela.setResizable(false);
		Janela.setTitle("Agente Marte");
		Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}			
	
	public void desenhar(int[][] tabela) throws InterruptedException {
		painel = new JPanel();
		painel.setLayout(new GridLayout(tabela.length,tabela[0].length));
		for (int i=0; i<tabela.length;i++) {
			for(int j=0;j<tabela[0].length;j++) {
				JPanel bloco = new JPanel();
				switch(tabela[i][j]) {
					case 0:{
						Color bg = new Color(150, 150, 150);
						bloco.setBackground(bg);
						break;
					}
					case 1:{
						Color bg = new Color(80, 80, 0);
						bloco.setBackground(bg);
						break;
					}
					case 2:{
						Color bg = new Color(40, 40, 40);
						bloco.setBackground(bg);
						break;
					}
					case 3:{
						Color bg = new Color(0, 0, 100);
						bloco.setBackground(bg);
						break;
					}
					case 4:{
						Color bg = new Color(255, 255, 255);
						bloco.setBackground(bg);
						break;
					}
					default: {
						Color bg = new Color(0, 100, 0);
						bloco.setBackground(bg);
						break;
					}
				}
				painel.add(bloco);
				
			}
		}
		Janela.add(painel, BorderLayout.CENTER);
		Janela.pack();
		Janela.setVisible(true);
		Thread.sleep( 200 );
	}
}
