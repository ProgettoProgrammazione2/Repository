package it.univr.GameOfLife;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Field extends JFrame{
	private int sizeSelected[] = new int[2];
	private boolean sizeSelect = false;
	private boolean endSelect = false;
	private boolean radioButtonClicked = false;
	public Field(){
		super("The Game Of Life");
		//dimensioni di default
		actionOnExit();
		getContentPane().setLayout(null);
		startingOptions start = new startingOptions();
		while(!endSelect);
		setDimension(sizeSelected[0],sizeSelected[1]);
		this.setVisible(true);
	}
	public void actionOnExit(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setDimension(int x, int y){
		int xSize = x;
		int ySize = y;

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
			//creo i 3 JRADIOBUTTON
			JRadioButton r1 = new JRadioButton("250x250");
			JRadioButton r2 = new JRadioButton("500x500");
			JRadioButton r3 = new JRadioButton("Full screen");
			//creo e aggiungo il listener dei radiobutton
			ActionListener listener = new JRadioButtonListener();
			r1.addActionListener(listener);
			r2.addActionListener(listener);
			r2.addActionListener(listener);
			
			//imposto la grandezza del frame
			setBounds(100,200,400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//aggiungo gli elementi al container
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(new JLabel("SELEZIONA UNA DIMENSIONE"), BorderLayout.NORTH);
			contentPane.add(r1,BorderLayout.WEST);
			contentPane.add(r2,BorderLayout.CENTER);
			contentPane.add(r3,BorderLayout.EAST);
			contentPane.add(bottoneOK,BorderLayout.SOUTH);

			//aggiungo un listener al bottone cosi quando clicco registro l'azione
			bottoneOK.addActionListener(new ClickButton());
			setResizable(false);
			pack();
			this.setVisible(true);
			while(!sizeSelect){//finchè non premo il bottone
				if(radioButtonClicked){//se un radioButton è stato spuntato
					if(r1.isSelected() ){
						r1.setSelected(true);
						r2.setSelected(false);
						r3.setSelected(false);
						sizeSelected[0]=250;
						sizeSelected[1]=250;
					}
					if(r2.isSelected() ){
						r2.setSelected(true);
						r3.setSelected(false);
						r1.setSelected(false);
						sizeSelected[0]=500;
						sizeSelected[1]=500;
					}
					if(r3.isSelected() ){
						r3.setSelected(true);
						r1.setSelected(false);
						r2.setSelected(false);
						sizeSelected[0]=1000;
						sizeSelected[1]=1000;
					}
				}
			};
			if(r1.isSelected() ){
				sizeSelected[0]=250;
				sizeSelected[1]=250;
			}
			if(r2.isSelected() ){
				sizeSelected[0]=500;
				sizeSelected[1]=500;
			}
			if(r3.isSelected()){
				Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
				sizeSelected[0]=(int)screen.getWidth();
				sizeSelected[1]=(int)screen.getHeight();
			}
			this.setVisible(false);
			endSelect = true;
		}
	}
	private class ClickButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			sizeSelect = true;
		}
		
	}
	private class JRadioButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			radioButtonClicked = true;
		}
	}
}
