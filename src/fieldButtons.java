package it.univr.GameOfLife;

import java.awt.Color;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
/**
 * 
 * @author Nicola Castellani
 * @author Pietro Musoni
 * 
 * La classe fieldButtons definisce l'oggetto bottone che corrisponde a una cellula.
 * <p>
 * Un bottone può essere nero, se è vivo, o bianco se è morto, inoltre è in grado
 * di capire se il giocatore sta giocando e se vuole disegnare.
 * <p>
 * I metodi definiti nella classe permettono di agire sullo stato del bottone
 *
 */
public class fieldButtons extends JButton{
	
	private int riga = 0;
	
	private int colonna = 0;
	
	private static int DIMENSIONE = 10;
	
	private boolean gameOn = false;
	
	private boolean black = false;
	
	static boolean userHasToDraw = false;
	
	private boolean isChecked = false;
	
	
	protected fieldButtons(){
		super("");	
		
		setBackground(Color.WHITE);
		
		setToolTipText("xPos : " + riga + " yPos : "+ colonna + " died");
		
		addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
                if(SelectionWindow.SetFigure){
                	
					Field.drawer.putFigure(e);
					
				}else{
					
					if(getColor() == Color.white && !gameOn){
						
						changeToBlack(); //se sono ancora in fase pre gioco lo creo
						
						setToolTipText("xPos : " + (riga+1) + " yPos : "+ (colonna + 1) + " alive");
						
					}else if(getColor() == Color.black && !gameOn){
						
						changeToWhite(); 
						
						setToolTipText("xPos : " + (riga+1) + " yPos : "+ (colonna + 1) + " died");
						
					}else if(getColor() == Color.black && gameOn){ 
						
						changeToWhite(); //lo uccido se sono in gioco
						
						setToolTipText("xPos : " + (riga + 1) + " yPos : "+ (colonna + 1) + " died");
						
					}else if(getColor() == Color.white && gameOn){ 
						
						changeToBlack(); //lo uccido se sono in gioco
						
						setToolTipText("xPos : " + (riga + 1) + " yPos : "+ (colonna + 1) + " alive");
						
					}else{
						
						//NOTHING_TO_DO
						
					}
					
				}

			}
			
		});
		
	}
	
	public boolean isBlack(){
		
		return black;
		
	}
	
	public int getRow(){
		
		return this.riga;
		
	}
	
	public int getColumn(){
		
		return this.colonna;
		
	}
	
	public boolean Checked(){
		
		return this.isChecked;
		
	}
	public void userHasToDraw(boolean b){
		
		if(b){
			
			this.userHasToDraw = true;
			
		}else{
			
			this.userHasToDraw = false;
			
			this.isChecked = false;
			
		}
		
	}
	public void isInGame(boolean b){
		
		gameOn = b;
		
	}
	public void changeToBlack(){
		
		setBackground(Color.black);
		
		setToolTipText("xPos : " + riga + " yPos : "+ colonna + " alive");
		
		black = true;
		
	}
	
	public void changeToWhite(){
		
		setBackground(Color.white);
		
		setToolTipText("xPos : " + riga + " yPos : "+ colonna + " died");
		
		black = false;
		
	}
	
	public Color getColor(){
		
		return getBackground();
		
	}
	
	public final void posizionaIn(int riga, int colonna) {
		
		this.riga = riga;
		
		this.colonna = colonna;

		setBounds(colonna * DIMENSIONE, riga * DIMENSIONE, DIMENSIONE, DIMENSIONE);
		
		changeToWhite();
		
	}
	
	public void setColor(Color c){
		
		if(c == Color.black)
			
			this.black = true;
		
		this.setBackground(c);
		
	}

}