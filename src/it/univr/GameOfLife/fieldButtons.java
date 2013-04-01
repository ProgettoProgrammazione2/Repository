package it.univr.GameOfLife;

import java.awt.Color;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
/**
 * 
 * <p>
 * La classe fieldButtons definisce l'oggetto bottone che corrisponde a una cellula.
 * <p>
 * Un bottone può essere nero, se è vivo, o bianco se è morto, inoltre è in grado
 * di capire se il giocatore sta giocando e se vuole disegnare.
 * <p>
 * I metodi definiti nella classe permettono di agire sullo stato del bottone
 * @author Nicola Castellani
 * @author Pietro Musoni
 */
public class fieldButtons extends JButton{

	private int riga = 0;

	private int colonna = 0;

	private static int DIMENSIONE = 10;

	private boolean gameOn = false;

	private boolean black = false;

	static boolean userHasToDraw = false;

	private boolean isChecked = false;

	/**
	 * Metodo costruttore della classe fieldButtons
	 * <p>
	 * Un bottone nasce morto, ovvero di colore bianco. Ogni bottone implementa un actionListener
	 * che fa capire al bottone, in base al fatto che sia in gioco o meno, se deve vivere, morire,
	 * oppure è il bottone di ancoraggio per il disegno di una figura preimpostata;
	 * <p> 
	 */
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
	/**
	 * 
	 * @return true 
	 * Il metodo ritorna true se e solo se il bottone è vivo
	 */
	public boolean isBlack(){

		return black;

	}
	/**
	 * 
	 * @return 
	 * La riga del bottone selezionato
	 */
	public int getRow(){

		return this.riga;

	}
	/**
	 * 
	 * @return 
	 * La colonna del bottone selezionato
	 */	
	public int getColumn(){

		return this.colonna;

	}
	/**
	 * Se l'utente decide di disegnare una figura è necessario che il bottone lo venga a sapere
	 * @param b 
	 * valore booleano in ingresso, true se l'utente ha intenzione di disegnare
	 */
	public void userHasToDraw(boolean b){

		if(b){

			this.userHasToDraw = true;

		}else{

			this.userHasToDraw = false;

			this.isChecked = false;

		}

	}
	/**
	 * Un bottone deve sapere se è in gioco o meno in quanto se viene cliccato mentre è in gioco deve morire, altrimenti
	 * nasce.
	 * @param b 
	 * true se l'utente è in gioco
	 */
	public void isInGame(boolean b){

		gameOn = b;

	}
	/**
	 * Colora il bottone di nero, un bottone nero è una cellula in vita.
	 * 
	 */
	public void changeToBlack(){

		setBackground(Color.black);

		setToolTipText("xPos : " + riga + " yPos : "+ colonna + " alive");

		black = true;

	}
	/**
	 * Colora il bottone di bianco, un bottone bianco è una cellula morta.
	 */
	public void changeToWhite(){

		setBackground(Color.white);

		setToolTipText("xPos : " + riga + " yPos : "+ colonna + " died");

		black = false;

	}
	/**
	 * 
	 * @return 
	 * Ritorna il colore del bottone, nero = cellula viva;bianco = cellula morta.
	 */
	public Color getColor(){

		return getBackground();

	}
	/**
	 * Posiziona il bottone nella riga e colonna stabilita nella matrice.
	 * @param riga 
	 * la riga dove viene posizionato il bottone
	 * @param colonna 
	 * la colonna dove viene posizionato il bottone
	 */
	public final void posizionaIn(int riga, int colonna) {

		this.riga = riga;

		this.colonna = colonna;

		setBounds(colonna * DIMENSIONE, riga * DIMENSIONE, DIMENSIONE, DIMENSIONE);

		changeToWhite();

	}

}