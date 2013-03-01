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
				if(getBackground() == Color.white && !gameOn){
					setBackground(Color.black); //se sono ancora in fase pre gioco lo creo
				}else if(getBackground() == Color.black && gameOn){ 
					setBackground(Color.white); //lo uccido se sono in gioco
				}else{
					//nothing to do
				}
			}
		});
	}
	public void isInGame(boolean b){
		gameOn = b;
	}
	public final void posizionaIn(int riga, int colonna) {
		this.riga = riga;
		this.colonna = colonna;

		setBounds(colonna * DIMENSIONE, riga * DIMENSIONE, DIMENSIONE, DIMENSIONE);
		setBackground(Color.WHITE);
	}

}
