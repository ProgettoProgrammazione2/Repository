package it.univr.GameOfLife;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GameOfLife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//cerco di settare il look and fell nativo di java o quello nativo del sistema ospitante
		   try {
			     // imposta il tema nativo
			     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			     // oppure imposta il tema multipiattaforma
			     //
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			  } catch (Exception ex) {
			     System.err.println("error loading look and feel - using default.");
			  }
		Field campoDaGioco = new Field();

	}

}
