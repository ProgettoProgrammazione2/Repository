package it.univr.GameOfLife;

import java.awt.Color;

import javax.swing.JButton;

public class fieldButtons extends JButton{
	private int riga = 0;
	private int colonna = 0;
	private static int DIMENSIONE = 10;
	protected fieldButtons(){
		super();
	}
	public final void posizionaIn(int riga, int colonna) {
		this.riga = riga;
		this.colonna = colonna;

		setBounds(colonna * DIMENSIONE, riga * DIMENSIONE, DIMENSIONE, DIMENSIONE);
		setBackground(Color.WHITE);
	}

}
