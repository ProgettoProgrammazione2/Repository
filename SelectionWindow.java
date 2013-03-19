package it.univr.GameOfLife;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
 



public class SelectionWindow extends JFrame implements ActionListener {
	
	static final long serialVersionUID = 2000;
	public static int WhichFigure;
	public static boolean SetFigure;
	public DrawFigure drawer;
	public fieldButtons[][] buttons;
	private int temp;
	private static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();	//variabile che assume i valori dello schermo
	JPanel topPanel;
	public JButton bottone1, bottone2, bottone3, bottone4, bottone5, bottone6, bottone7, bottone8, bottone9;
	
	public SelectionWindow(int x) {
		int xLoc = 0;
		temp = x;
		setTitle( "Finestra di selezione" );				//creazione della finestra di selezione
		setSize( 85 * 3 + 20, 85 * 3 + 50); 					//della figura seme per game of life
		topPanel = new JPanel(new GridLayout(3,3));
		drawer = new DrawFigure();
		if(x == 250){
			xLoc = ((int)screen.getWidth()/2) + 200;
		}else if(x == 500){
			xLoc = ((int)screen.getWidth()/2) + 300;
		}else{
			xLoc = ((int)screen.getWidth()/2) + 420;
		}
		buttons = new fieldButtons[temp/10][temp/10];
		for(int i = 0;i < buttons.length; i++){
			for(int j = 0; j < buttons[0].length; j++){
				buttons[i][j] = new fieldButtons();
			}
		}
		setLocation(xLoc,300);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		bottone1 = new JButton(new ImageIcon("images/bottone1.gif"));		//associa ad ogni bottone 
		bottone2 = new JButton(new ImageIcon("images/bottone2.gif"));			//un'immagine seme per 
		bottone3 = new JButton(new ImageIcon("images/bottone3.gif"));		//game of life
		bottone4 = new JButton(new ImageIcon("images/bottone4.gif"));
		bottone5 = new JButton(new ImageIcon("images/bottone5.gif"));
		bottone6 = new JButton(new ImageIcon("images/bottone6.gif"));
		bottone7 = new JButton(new ImageIcon("images/bottone7.gif"));
		bottone8 = new JButton(new ImageIcon("images/bottone8.gif"));
		bottone9 = new JButton(new ImageIcon("images/bottone9.gif"));
						
		topPanel.add(bottone1);
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
		
		
		
																	
		bottone1.addActionListener( new ActionListener() {		//ad ogni bottone si passa una 
			public void actionPerformed(ActionEvent e) {		//variabile per determinare
				if (!SetFigure) {
					bottone1.setIcon(new ImageIcon("images/negative1.gif"));
					WhichFigure = 1;
					SetFigure = true;
				}
				else
					if (WhichFigure == 1){
						ChangeIcon(1);
						SetFigure = false;
					}
					else {
						ChangeIcon(WhichFigure);
						bottone1.setIcon(new ImageIcon("images/negative1.gif"));
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
				}
				else
					if (WhichFigure == 2) {
						ChangeIcon(2);
						SetFigure = false;
					}
					else {
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
				}
				else
					if (WhichFigure == 3){
						ChangeIcon(3);
						SetFigure = false;
					}
					else {
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
				}
				else
					if (WhichFigure == 4){
						ChangeIcon(4);
						SetFigure = false;
					}
					else {
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
				}
				else
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
	
	
	
	
	public void ChangeIcon(int WhichFigure) {
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
	
	public void putFigure(int x,int y, fieldButtons[][] buttons){
		drawer.putFigure(x,y,buttons);
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public class DrawFigure extends JButton {
		public void putFigure(int x, int y, fieldButtons butt[][]) {
			
			final int Row = x;
			final int Column = y;
			int i,j;
			//copio la matrice originale (butt) in quella temporanea (buttons)
			while(true){
			for(i = 0; i < buttons.length ; i++){
				for(j = 0; j < buttons[0].length; j++){
					if(butt[i][j].isBlack()){
						buttons[i][j].changeToBlack();
					}else{
						buttons[i][j].changeToWhite();
					}
				}
			}
			
				if (fieldButtons.userHasToDraw){
					switch(SelectionWindow.WhichFigure) {
					
					
				
					case 1:{//posiziono la figura 1
						try{
							buttons[Row][Column + 1].setBackground(Color.black);	//costruisco la figura dal bottone di partenza
							buttons[Row][Column].setBackground(Color.black);
							buttons[Row][Column - 1].setBackground(Color.black);	
						}catch(ArrayIndexOutOfBoundsException e){}
						//SelectionWindow.bottone1.setBackground(Color.black);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
						}
							
					case 2:{
						try{
							buttons[Row][Column + 1].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
							buttons[Row][Column].setBackground(Color.black);
							buttons[Row + 1][Column].setBackground(Color.black);
							buttons[Row + 2][Column].setBackground(Color.black);
							buttons[Row + 1][Column + 1].setBackground(Color.black);
							buttons[Row - 1][Column + 1].setBackground(Color.black);
						}catch(ArrayIndexOutOfBoundsException e){
						}

								//SelectionWindow.ChangeIcon(2);
								SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
							
						}
					
				
				
					case 3: {
						try{
							buttons[Row][Column + 1].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
							buttons[Row - 1][Column - 1].setBackground(Color.black);
							buttons[Row - 1][Column].setBackground(Color.black);
							buttons[Row + 2][Column + 2].setBackground(Color.black);
							buttons[Row + 2][Column + 1].setBackground(Color.black);
							buttons[Row + 1][Column + 2].setBackground(Color.black);	
						}catch(ArrayIndexOutOfBoundsException e){}
								//ChangeIcon(3);
								SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					}
					
				
				
					case 4: {
						try{
							buttons[Row-2][Column-1].setBackground(Color.black);
							buttons[Row-3][Column-1].setBackground(Color.black);
							buttons[Row+2][Column-1].setBackground(Color.black);
							buttons[Row+3][Column-1].setBackground(Color.black);
							buttons[Row-1][Column-2].setBackground(Color.black);
							buttons[Row-3][Column-2].setBackground(Color.black);
							buttons[Row-5][Column-2].setBackground(Color.black);
							buttons[Row+1][Column-2].setBackground(Color.black);
							buttons[Row+3][Column-2].setBackground(Color.black);
							buttons[Row+5][Column-2].setBackground(Color.black);
							buttons[Row-1][Column-3].setBackground(Color.black);
							buttons[Row-2][Column-3].setBackground(Color.black);
							buttons[Row-5][Column-3].setBackground(Color.black);
							buttons[Row-6][Column-3].setBackground(Color.black);
							buttons[Row-7][Column-3].setBackground(Color.black);
							buttons[Row+1][Column-3].setBackground(Color.black);
							buttons[Row+2][Column-3].setBackground(Color.black);
							buttons[Row+5][Column-3].setBackground(Color.black);
							buttons[Row+6][Column-3].setBackground(Color.black);
							buttons[Row+7][Column-3].setBackground(Color.black);
							buttons[Row-2][Column-5].setBackground(Color.black);
							buttons[Row-3][Column-5].setBackground(Color.black);
							buttons[Row+2][Column-5].setBackground(Color.black);
							buttons[Row+3][Column-5].setBackground(Color.black);
							
							buttons[Row-2][Column+1].setBackground(Color.black);
							buttons[Row-3][Column+1].setBackground(Color.black);
							buttons[Row+2][Column+1].setBackground(Color.black);
							buttons[Row+3][Column+1].setBackground(Color.black);
							buttons[Row-1][Column+2].setBackground(Color.black);
							buttons[Row-3][Column+2].setBackground(Color.black);
							buttons[Row-5][Column+2].setBackground(Color.black);
							buttons[Row+1][Column+2].setBackground(Color.black);
							buttons[Row+3][Column+2].setBackground(Color.black);
							buttons[Row+5][Column+2].setBackground(Color.black);
							buttons[Row-1][Column+3].setBackground(Color.black);
							buttons[Row-2][Column+3].setBackground(Color.black);
							buttons[Row-5][Column+3].setBackground(Color.black);
							buttons[Row-6][Column+3].setBackground(Color.black);
							buttons[Row-7][Column+3].setBackground(Color.black);
							buttons[Row+1][Column+3].setBackground(Color.black);
							buttons[Row+2][Column+3].setBackground(Color.black);
							buttons[Row+5][Column+3].setBackground(Color.black);
							buttons[Row+6][Column+3].setBackground(Color.black);
							buttons[Row+7][Column+3].setBackground(Color.black);
							buttons[Row-2][Column+5].setBackground(Color.black);
							buttons[Row-3][Column+5].setBackground(Color.black);
							buttons[Row+2][Column+5].setBackground(Color.black);
							buttons[Row+3][Column+5].setBackground(Color.black);
						}catch(ArrayIndexOutOfBoundsException e){}
								
								//ChangeIcon(4);
								SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					}
					
				
				
					case 5: {
						try{
							buttons[Row][Column-1].setBackground(Color.black);
							buttons[Row+1][Column].setBackground(Color.black);
							buttons[Row+1][Column+1].setBackground(Color.black);
							buttons[Row][Column+1].setBackground(Color.black);
							buttons[Row-1][Column+1].setBackground(Color.black);	
						}catch(ArrayIndexOutOfBoundsException e){}
								//ChangeIcon(5);
								SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					}
					
				
				
					case 6: {
						try{
							buttons[Row-2][Column-2].setBackground(Color.black);
							buttons[Row+1][Column-2].setBackground(Color.black);
							buttons[Row-2][Column].setBackground(Color.black);
							buttons[Row+2][Column].setBackground(Color.black);
							buttons[Row+2][Column-1].setBackground(Color.black);
							buttons[Row-1][Column+1].setBackground(Color.black);
							buttons[Row][Column+1].setBackground(Color.black);
							buttons[Row+1][Column+1].setBackground(Color.black);
							buttons[Row+2][Column+1].setBackground(Color.black);
						}catch(ArrayIndexOutOfBoundsException e){}					
								//ChangeIcon(5);
								SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					}
					
				
				
					case 7: {
						try{
							buttons[Row][Column].setBackground(Color.black);
							buttons[Row+1][Column-1].setBackground(Color.black);
							buttons[Row+1][Column].setBackground(Color.black);
							buttons[Row+1][Column+1].setBackground(Color.black);
							buttons[Row+2][Column-2].setBackground(Color.black);
							buttons[Row+2][Column+2].setBackground(Color.black);
							buttons[Row+3][Column-3].setBackground(Color.black);
							buttons[Row+3][Column-1].setBackground(Color.black);
							buttons[Row+3][Column].setBackground(Color.black);
							buttons[Row+3][Column+1].setBackground(Color.black);
							buttons[Row+3][Column+3].setBackground(Color.black);
							buttons[Row+4][Column-2].setBackground(Color.black);
							buttons[Row+4][Column-1].setBackground(Color.black);
							buttons[Row+4][Column].setBackground(Color.black);
							buttons[Row+4][Column+1].setBackground(Color.black);
							buttons[Row+4][Column+2].setBackground(Color.black);	
						}catch(ArrayIndexOutOfBoundsException e){}
								//ChangeIcon(7);
								SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					}
					
				
				
					case 8: {
						try{
							buttons[Row][Column].setBackground(Color.black);
							buttons[Row][Column+1].setBackground(Color.black);
							buttons[Row+1][Column].setBackground(Color.black);
							buttons[Row+1][Column+1].setBackground(Color.black);	
						}catch(ArrayIndexOutOfBoundsException e){}
								//ChangeIcon(8);
								SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					}
					
				
				
					case 9: {
						try{
							buttons[Row][Column].setBackground(Color.black);
							buttons[Row-1][Column-2].setBackground(Color.black);
							buttons[Row-1][Column-1].setBackground(Color.black);
							buttons[Row-1][Column].setBackground(Color.black);
							buttons[Row-1][Column+1].setBackground(Color.black);
							buttons[Row-1][Column+2].setBackground(Color.black);
							buttons[Row][Column-3].setBackground(Color.black);
							buttons[Row][Column-1].setBackground(Color.black);
							buttons[Row][Column+1].setBackground(Color.black);
							buttons[Row][Column+3].setBackground(Color.black);
							buttons[Row+1][Column-2].setBackground(Color.black);
							buttons[Row+1][Column+2].setBackground(Color.black);
							buttons[Row+2][Column-1].setBackground(Color.black);
							buttons[Row+2][Column].setBackground(Color.black);
							buttons[Row+2][Column+1].setBackground(Color.black);
							buttons[Row+3][Column].setBackground(Color.black);
						}catch(ArrayIndexOutOfBoundsException e){}
								SelectionWindow.SetFigure = false;
						}
				
					}
				}
			}
		}
		
	}

}
