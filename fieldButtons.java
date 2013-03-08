package it.univr.GameOfLife;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class fieldButtons extends JButton{
	private int riga = 0;
	private int colonna = 0;
	private static int DIMENSIONE = 10;
	private boolean gameOn = false;
	private boolean black = false;
	private boolean checked = false;
	private static boolean hasToChange = false;
	protected fieldButtons(){
		super("");	
		setBackground(Color.WHITE);
		addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(getColor() == Color.white && !gameOn){
					changeToBlack(); //se sono ancora in fase pre gioco lo creo
				}else if(getColor() == Color.black && gameOn){ 
					changeToWhite(); //lo uccido se sono in gioco
				}else{
					//nothing to do
				}
			}
		});
	}
	public boolean isBlack(){
		return black;
	}
	public void isInGame(boolean b){
		gameOn = b;
	}
	public void changeToBlack(){
		setBackground(Color.black);
		black = true;
	}
	public void changeToWhite(){
		setBackground(Color.white);
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
	public void checked(boolean b){
		this.checked = b;
	}
	public boolean isAlreadyChecked(){
		return this.checked;
	}
	public void setColor(Color c){
		if(c == Color.black)
			this.black = true;
		this.setBackground(c);
		this.setVisible(true);
	}
	public void hasToChange(boolean b){
		this.hasToChange = b;
	}
	public boolean hasToChange(){
		return this.hasToChange;
	}

}
