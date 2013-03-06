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
	public void isInGame(boolean b){
		gameOn = b;
	}
	public void changeToBlack(){
		setBackground(Color.black);
	}
	public void changeToWhite(){
		setBackground(Color.white);
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

}
