package it.univr.GameOfLife;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectionWindow extends JFrame {
	
	static final long serialVersionUID = 2000;
	
	public static int WhichFigure;
	
	public static boolean SetFigure;
	
	JPanel topPanel;
	
	public JButton bottone1, bottone2, bottone3, bottone4, bottone5, bottone6, bottone7, bottone8, bottone9;
	
	public SelectionWindow(int xPos,int yPos) {
	
		setTitle( "Finestra di selezione" );				//creazione della finestra di selezione
		
		setSize( 85 * 3 + 20, 85 * 3 + 50); 					//della figura seme per game of life
		
		topPanel = new JPanel(new GridLayout(3,3));
		
		
		bottone1 = new JButton(new ImageIcon("images/bottone1.gif"));		//associa ad ogni bottone 
		
		bottone2 = new JButton(new ImageIcon("images/bottone2.gif"));			//un'immagine seme per 
		
		bottone3 = new JButton(new ImageIcon("images/bottone3.gif"));		//game of life
		
		bottone4 = new JButton(new ImageIcon("images/bottone4.gif"));
		
		bottone5 = new JButton(new ImageIcon("images/bottone5.gif"));
		
		bottone6 = new JButton(new ImageIcon("images/bottone6.gif"));
		
		bottone7 = new JButton(new ImageIcon("images/bottone7.gif"));
		
		bottone8 = new JButton(new ImageIcon("images/bottone8.gif"));
		
		bottone9 = new JButton(new ImageIcon("images/bottone9.gif"));
						
		topPanel.add(bottone1);								//aggiungo al pannello i 9 bottoni di selezione
		
		topPanel.add(bottone2);
		
		topPanel.add(bottone3);
		
		topPanel.add(bottone4);
		
		topPanel.add(bottone5);
		
		topPanel.add(bottone6);
		
		topPanel.add(bottone7);
		
		topPanel.add(bottone8);
		
		topPanel.add(bottone9);
		
		getContentPane().add(topPanel);
		
		setResizable(false);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		Dimension frame = getSize();
		
		if(xPos==250){
			
			setLocation((screen.width - frame.width)/2 + xPos +135,(screen.height - frame.height)/2 + 10);
			
		}else if(xPos == 500){
			
			setLocation((screen.width - frame.width)/2 + xPos -20,(screen.height - frame.height)/2 + 10);
			
		}else{
			
			setLocation((screen.width - frame.width)/2 + xPos -200,(screen.height - frame.height)/2 + 10);
			
		}
																
		bottone1.addActionListener( new ActionListener() {					//ad ogni bottone si passa una 
			
			public void actionPerformed(ActionEvent e) {					//variabile per determinare a quale figura si riferisce
				
				if (!SetFigure) {												//Se non è selezionato nessun bottone, seleziono
			
					bottone1.setIcon(new ImageIcon("images/negative1.gif"));	//questo
					
					WhichFigure = 1;
					
					SetFigure = true;
				}else if (WhichFigure == 1){
					
						ChangeIcon(1);
						
						SetFigure = false;
					
				}else {
						
					ChangeIcon(WhichFigure);									//Se è già stato selezionato un altro bottone 
					
					bottone1.setIcon(new ImageIcon("images/negative1.gif"));	//lo deseleziono e poi seleziono questo
					
					WhichFigure = 1;
					
				}
				
			}
		
		});
		
		bottone2.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) { 
			
				if (!SetFigure) {
				
					bottone2.setIcon(new ImageIcon("images/negative2.gif"));
					
					WhichFigure = 2;
					
					SetFigure = true;
				
				}else if (WhichFigure == 2) {
						
					ChangeIcon(2);
					
					SetFigure = false;
					
				}else {
				
					ChangeIcon(WhichFigure);
						
					bottone2.setIcon(new ImageIcon("images/negative2.gif"));
					
					WhichFigure = 2;
					
				}				
				
			}
		
		});
		
		bottone3.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			
				if (!SetFigure) {
				
					bottone3.setIcon(new ImageIcon("images/negative3.gif"));
					
					WhichFigure = 3;
					
					SetFigure = true;
				
				}else if (WhichFigure == 3){
						
					ChangeIcon(3);
					
					SetFigure = false;
					
				}else {
				
					ChangeIcon(WhichFigure);
					
					bottone3.setIcon(new ImageIcon("images/negative3.gif"));
					
					WhichFigure = 3;
					
				}		
			
			}
		
		});
		
		bottone4.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			
				if (!SetFigure) {
				
					bottone4.setIcon(new ImageIcon("images/negative4.gif"));
					
					WhichFigure = 4;
					
					SetFigure = true;
				
				}else if (WhichFigure == 4){
				
					ChangeIcon(4);
					
					SetFigure = false;
					
				}else {
				
					ChangeIcon(WhichFigure);
					
					bottone4.setIcon(new ImageIcon("images/negative4.gif"));
					
					WhichFigure = 4;
					
				}		
			
			}
		
		});
		
		bottone5.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			
				if (!SetFigure) {
				
					bottone5.setIcon(new ImageIcon("images/negative5.gif"));
					
					WhichFigure = 5;
					
					SetFigure = true;
				}else
				
					if (WhichFigure == 5){
					
						ChangeIcon(5);
						
						SetFigure = false;
					
					}
					
					else {
					
						ChangeIcon(WhichFigure);
						
						bottone5.setIcon(new ImageIcon("images/negative5.gif"));
						
						WhichFigure = 5;
					
					}	
			
			}
		
		});
		
		bottone6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!SetFigure) {
					bottone6.setIcon(new ImageIcon("images/negative6.gif"));
					WhichFigure = 6;
					SetFigure = true;
				}
				
				else
					if (WhichFigure == 6){
						ChangeIcon(6);
						SetFigure = false;
					}
					else {
						ChangeIcon(WhichFigure);
						bottone6.setIcon(new ImageIcon("images/negative6.gif"));
						WhichFigure = 6;
					}		
			}
		});
		
		bottone7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!SetFigure) {
					bottone7.setIcon(new ImageIcon("images/negative7.gif"));
					WhichFigure = 7;
					SetFigure = true;
				}
				else
					if (WhichFigure == 7){
						ChangeIcon(7);
						SetFigure = false;
					}
					else {
						ChangeIcon(WhichFigure);
						bottone7.setIcon(new ImageIcon("images/negative7.gif"));
						WhichFigure = 7;
					}		
			}
		});
		
		bottone8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!SetFigure) {
					bottone8.setIcon(new ImageIcon("images/negative8.gif"));
					WhichFigure = 8;
					SetFigure = true;
				}
				else
					if (WhichFigure == 8){
						ChangeIcon(8);
						SetFigure = false;
					}
					else {
						ChangeIcon(WhichFigure);
						bottone8.setIcon(new ImageIcon("images/negative8.gif"));
						WhichFigure = 8;
					}		
			}
		});
		
		bottone9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!SetFigure) {
					bottone9.setIcon(new ImageIcon("images/negative9.gif"));
					WhichFigure = 9;
					SetFigure = true;
				}
				else
					if (WhichFigure == 9){
						ChangeIcon(9);
						SetFigure = false;
					}
					else {
						ChangeIcon(WhichFigure);
						bottone9.setIcon(new ImageIcon("images/negative9.gif"));
						WhichFigure = 9;
					}		
			}
		});
		
		setVisible(true);		
	}
	
	
	
	public void ChangeIcon(int WhichFigure) {								//deseleziona un bottone, passatogli sotto la variabile WhichFigure
		if (WhichFigure == 1)
			bottone1.setIcon(new ImageIcon("images/bottone1.gif"));
		else if(WhichFigure == 2)
			bottone2.setIcon(new ImageIcon("images/bottone2.gif"));
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
		}
	
}