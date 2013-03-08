package it.univr.GameOfLife;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
 



class SelectionWindow extends JFrame implements ActionListener {
  public int WhichFigure;
	public boolean SetFigure;
	JPanel topPanel;
	public JButton bottone1, bottone2, bottone3, bottone4, bottone5, bottone6, bottone7, bottone8, bottone9, bottone10;
	public SelectionWindow() {
		setTitle( "Finestra di selezione" );				//creazione della finestra di selezione
		setSize( 85 * 3 + 20, 85 * 4 + 50); 					//della figura seme per game of life
		topPanel = new JPanel(new GridLayout(4,3));
		
		bottone1 = new JButton(new ImageIcon("images/bottone1.gif"));		//associa ad ogni bottone 
		bottone2 = new JButton(new ImageIcon("images/bottone2.gif"));			//un'immagine seme per 
		bottone3 = new JButton(new ImageIcon("images/bottone3.gif"));		//game of life
		bottone4 = new JButton(new ImageIcon("images/bottone4.gif"));
		bottone5 = new JButton(new ImageIcon("images/bottone5.gif"));
		bottone6 = new JButton(new ImageIcon("images/bottone6.gif"));
		bottone7 = new JButton(new ImageIcon("images/bottone7.gif"));
		bottone8 = new JButton(new ImageIcon("images/bottone8.gif"));
		bottone9 = new JButton(new ImageIcon("images/bottone6.gif"));
		bottone10 = new JButton(new ImageIcon("images/bottone10.gif"));
				
		topPanel.add(bottone1);
		topPanel.add(bottone2);
		topPanel.add(bottone3);
		topPanel.add(bottone4);
		topPanel.add(bottone5);
		topPanel.add(bottone6);
		topPanel.add(bottone7);
		topPanel.add(bottone8);
		topPanel.add(bottone9);
		topPanel.add(bottone10);
		
		getContentPane().add(topPanel);			
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frame = getSize();
		setLocation(
				(screen.width - frame.width) ,				//posiziona la finestra sul lato sinistro dello schermo
				(screen.height - frame.height) / 2
				);
		
		
		
																	
		bottone1.addActionListener( new ActionListener() {		//ad ogni bottone si passa una 
			public void actionPerformed(ActionEvent e) {		//variabile per determinare
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone1.setIcon(new ImageIcon("images/negative1.gif"));
				SetFigure = true;									//a quale figura ci si riferisce
				WhichFigure = 1;
				
			}
		});
		bottone2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {          
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone2.setIcon(new ImageIcon("images/negative2.gif"));
				SetFigure = true;
				WhichFigure = 2;
			}
		});
		bottone3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone3.setIcon(new ImageIcon("images/negative3.gif"));
				SetFigure = true;
				WhichFigure = 3;
			}
		});
		bottone4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone4.setIcon(new ImageIcon("images/negative4.gif"));
				SetFigure = true;
				WhichFigure = 4;
			}
		});
		bottone5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone5.setIcon(new ImageIcon("images/negative5.gif"));
				SetFigure = true;
				WhichFigure = 5;
			}
		});
		bottone6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone6.setIcon(new ImageIcon("images/negative6.gif"));
				SetFigure = true;
				WhichFigure = 6;
			}
		});
		bottone7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone7.setIcon(new ImageIcon("images/negative7.gif"));
				SetFigure = true;
				WhichFigure = 7;
			}
		});
		bottone8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone8.setIcon(new ImageIcon("images/negative8.gif"));
				SetFigure = true;
				WhichFigure = 8;
			}
		});
		bottone9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SetFigure)
					ChangeIcon(WhichFigure);
				bottone9.setIcon(new ImageIcon("images/negative9.gif"));
				SetFigure = true;
				WhichFigure = 9;
			}
		});
		
		
	}
	
	
	
	
	public void ChangeIcon(int WhichFigure) {
		if (WhichFigure == 1)
			bottone1.setIcon(new ImageIcon("images/bottone1.gif"));			//se si è già selezionato un bottone
		else if(WhichFigure == 2)							//e lo si vuole cambiare ChangeIcon lo riporta
			bottone2.setIcon(new ImageIcon("images/bottone2.gif"));			//alla forma originaria
		else if(WhichFigure == 3)
			bottone3.setIcon(new ImageIcon("images/bottone3.gif"));
		else if(WhichFigure == 4)
			bottone4.setIcon(new ImageIcon("images/bottone4.gif"));
		else if(WhichFigure == 5)
			bottone5.setIcon(new ImageIcon("images/bottone5.gif"));
		else if(WhichFigure == 6)
			bottone6.setIcon(new ImageIcon("images/bottone6.gif"));
		else if(WhichFigure == 7)
			bottone7.setIcon(new ImageIcon("images/bottone7.gif"));
		else if(WhichFigure == 8)
			bottone8.setIcon(new ImageIcon("images/bottone8.gif"));
		else if(WhichFigure == 9)
			bottone9.setIcon(new ImageIcon("images/bottone9.gif"));
		SetFigure = false;
		}
	
	
	
																		//main per mostrare la finestra
	public static void main(String args[]) {
		new SelectionWindow().setVisible(true);
		}
}

