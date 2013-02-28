package it.univr.GameOfLife;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Field extends JFrame{
	private int sizeSelected[] = new int[2];
	public Field(){
		super("The Game Of Life");
		actionOnExit();
		getContentPane().setLayout(null);
		setDimension(sizeSelected[0],sizeSelected[1]);
		startingOptions start = new startingOptions();
		this.setVisible(true);
	}
	public void actionOnExit(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setDimension(int x, int y){
		int xSize = 500;
		int ySize = 500;

		setSize(xSize, ySize);
		setResizable(false);//non è modificabile
		
	}
	private class startingOptions extends JFrame{
		private startingOptions(){
			super("The Game Of Life");
			setBounds(100,200,400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(new JLabel("SELEZIONA UNA DIMENSIONE"), BorderLayout.PAGE_START);
			this.setVisible(true);
		}
	}
}
