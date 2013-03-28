package it.univr.GameOfLife;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 
 * @author Nicola "Field" Castellani
 * @author Pietro "Drawer" Musoni
 *
 * GameOfLife: http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 * 
 * <p>
 * La classe main cerca di determinare l'interfaccia grafica da utilizzare, ovvero
 * cerca di impostare l'interfaccia di sistema, nel caso in cui non ci riuscisse
 * imposta l'interfaccia JAVA di default.
 * <p>
 * Una volta fatto questo genera una nuova istanza di Field, corpo del gioco.
 * 
 */
public class GameOfLife {
	public static void main() {
		
		   try {
			     
			     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			
			  } catch (Exception ex) {
				  
			     System.err.println("error loading look and feel - using default.");
			     
			  }
		   
		Field campoDaGioco = new Field();

	}

}