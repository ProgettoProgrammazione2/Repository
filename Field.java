package it.univr.GameOfLife;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Field extends JFrame{
	private int sizeSelected[] = new int[2];
	private boolean sizeSelect = false;
	public Field(){
		super("The Game Of Life");
		//dimensioni di default
		sizeSelected[0] = 500;
		sizeSelected[1] = 500;
		actionOnExit();
		getContentPane().setLayout(null);
		setDimension(sizeSelected[0],sizeSelected[1]);
		startingOptions start = new startingOptions();
		System.out.print("lol");
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
	/*
	 * 
	 * Questa classe permette di definire la grandezza iniziale del form
	 * 
	 * */
	private class startingOptions extends JFrame{
		private startingOptions(){
			super("The Game Of Life");
			//bottone
			JButton bottoneOK = new JButton("Ok, procediamo");
			setBounds(100,200,400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(new JLabel("SELEZIONA UNA DIMENSIONE"), BorderLayout.NORTH);
			contentPane.add(bottoneOK,BorderLayout.SOUTH);
			//aggiungo un listener al bottone cosi quando clicco registro l'azione
			bottoneOK.addActionListener(new ClickButton());
			setResizable(false);
			pack();
			this.setVisible(true);
			while(!sizeSelect){
				//se non lo inserisco il programma non funziona
				System.out.print("");
			};
			this.setVisible(false);
		}
	}
	private class ClickButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			sizeSelect = true;
		}
		
	}
}
