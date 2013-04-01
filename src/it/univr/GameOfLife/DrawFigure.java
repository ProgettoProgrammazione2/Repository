package it.univr.GameOfLife;


import java.awt.event.*;
import javax.swing.JButton;


/**
 * La classe DrawFigure crea il drawer delle figure selezionate nella SelectionWindow
 * @author Nicola "Field" Castellani
 * @author Pietro "Drawer" Musoni
 */
public class DrawFigure extends JButton {
	
	static final long serialVersionUID = 3000;
	//salvo in una variabile la dimensione della matrice quadrata di gioco
	public static int size = Field.buttons.length;		
	
	int figuraLength;
	
	public fieldButtons[][] figura; 
		
	/**
	 * <p>
	 * il metodo putFigure crea piccole matrici di bottoni, componendovi all'interno la figura selezionata nella SelectionWindow
	 * tramite la variabile WhichFigure che tiene traccia della figura selezionata. Ogni matrice è fatta su misura per la figura
	 * a cui è designata
	 * 
	 * @param evento 
	 * riceve in entrata la selezione del bottone della matrice di gioco per riuscire a determinare quale pulsante è stato premuto
	 * e di conseguenza da dove partire a costruire la fugura
	 */
	public void putFigure(ActionEvent evento){
		
		for(int Row = 0; Row < size; Row++)
			
			for(int Column = 0; Column < size; Column++)
				//trovo il bottone che l'utente ha premuto sulla matrice principale e ne salvo le coordinate
				if(evento.getSource() == Field.buttons[Column][Row]){			
							
					switch(SelectionWindow.WhichFigure) {
					
						case 1:{
							//creo una matrice su misura per la figuro e la disegno cambiando colore ai bottoni corrispondenti
							figuraLength = 3;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[1][0].changeToBlack();
							
							figura[1][1].changeToBlack();
							
							figura[1][2].changeToBlack();
							
							ControlBorder(size, figura, figuraLength, Column, Row);
														
						};break;
					
						case 2:{
							
							figuraLength = 4;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[0][2].changeToBlack();
							
							figura[1][1].changeToBlack();
							
							figura[1][2].changeToBlack();
							
							figura[2][1].changeToBlack();
							
							figura[2][2].changeToBlack();
							
							figura[3][1].changeToBlack();
							
							ControlBorder(size, figura, figuraLength, Column, Row);
							
						};break;
			
		
		
						case 3: {
							
							figuraLength = 4;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[0][0].changeToBlack();
							
							figura[0][1].changeToBlack();
							
							figura[1][0].changeToBlack();
							
							figura[2][3].changeToBlack();
							
							figura[3][2].changeToBlack();
							
							figura[3][3].changeToBlack();
							
							ControlBorder(size, figura, figuraLength, Column, Row);
							
						};break;
			
		
		
						case 4: {
							
							figuraLength = 15;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[0][4].changeToBlack();
							
							figura[0][10].changeToBlack();
							
							figura[1][4].changeToBlack();
							
							figura[1][10].changeToBlack();
							
							figura[2][4].changeToBlack();
							
							figura[2][5].changeToBlack();
							
							figura[2][9].changeToBlack();
							
							figura[2][10].changeToBlack();
							
							figura[4][0].changeToBlack();
							
							figura[4][1].changeToBlack();
							
							figura[4][2].changeToBlack();
							
							figura[4][5].changeToBlack();
							
							figura[4][6].changeToBlack();
							
							figura[4][8].changeToBlack();
							
							figura[4][9].changeToBlack();
							
							figura[4][12].changeToBlack();
							
							figura[4][13].changeToBlack();
							
							figura[4][14].changeToBlack();
							
							figura[5][2].changeToBlack();
							
							figura[5][4].changeToBlack();
							
							figura[5][6].changeToBlack();
							
							figura[5][8].changeToBlack();
							
							figura[5][10].changeToBlack();
							
							figura[5][12].changeToBlack();
							
							figura[6][4].changeToBlack();
							
							figura[6][5].changeToBlack();
							
							figura[6][9].changeToBlack();
							
							figura[6][10].changeToBlack();
							
							figura[8][4].changeToBlack();
							
							figura[8][5].changeToBlack();
							
							figura[8][9].changeToBlack();
							
							figura[8][10].changeToBlack();
							
							figura[9][2].changeToBlack();
							
							figura[9][4].changeToBlack();
							
							figura[9][8].changeToBlack();
							
							figura[9][10].changeToBlack();
							
							figura[9][12].changeToBlack();
							
							figura[9][6].changeToBlack();
							
							figura[10][0].changeToBlack();
							
							figura[10][1].changeToBlack();
							
							figura[10][2].changeToBlack();
							
							figura[10][5].changeToBlack();
							
							figura[10][6].changeToBlack();
							
							figura[10][8].changeToBlack();
							
							figura[10][9].changeToBlack();
							
							figura[10][12].changeToBlack();
							
							figura[10][13].changeToBlack();
							
							figura[10][14].changeToBlack();
							
							figura[12][4].changeToBlack();							
							
							figura[12][5].changeToBlack();
							
							figura[12][9].changeToBlack();
							
							figura[12][10].changeToBlack();							
							
							figura[13][4].changeToBlack();	
							
							figura[13][10].changeToBlack();	
							
							figura[14][4].changeToBlack();	
							
							figura[14][10].changeToBlack();	
													
							ControlBorder(size, figura, figuraLength, Column, Row);
							
						};break;
			
		
		
						case 5: {
							
							figuraLength = 3;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[1][0].changeToBlack();
							
							figura[2][1].changeToBlack();
							
							figura[0][2].changeToBlack();
							
							figura[1][2].changeToBlack();
							
							figura[2][2].changeToBlack();
							
							
							ControlBorder(size, figura, figuraLength, Column, Row);
							
						};break;
			
		
		
						case 6: {
							
							figuraLength = 5;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[0][0].changeToBlack();
							
							figura[3][0].changeToBlack();
							
							figura[4][1].changeToBlack();
							
							figura[0][2].changeToBlack();
							
							figura[4][2].changeToBlack();
							
							figura[1][3].changeToBlack();
							
							figura[2][3].changeToBlack();
							
							figura[3][3].changeToBlack();
							
							figura[4][3].changeToBlack();
							
							ControlBorder(size, figura, figuraLength, Column, Row);
							
						};break;
			
		
		
						case 7: {
							
							figuraLength = 7;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[1][3].changeToBlack();
							
							figura[2][2].changeToBlack();
							
							figura[2][3].changeToBlack();
							
							figura[2][4].changeToBlack();
							
							figura[3][1].changeToBlack();
							
							figura[3][5].changeToBlack();
							
							figura[4][0].changeToBlack();
							
							figura[4][2].changeToBlack();
							
							figura[4][3].changeToBlack();
							
							figura[4][4].changeToBlack();
							
							figura[4][6].changeToBlack();
							
							figura[5][1].changeToBlack();
							
							figura[5][2].changeToBlack();
							
							figura[5][3].changeToBlack();
							
							figura[5][4].changeToBlack();
							
							figura[5][5].changeToBlack();
							
							ControlBorder(size, figura, figuraLength, Column, Row);

							
						};break;
						
						
						
						case 8: {
							
							figuraLength = 2;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[0][0].changeToBlack();
							
							figura[0][1].changeToBlack();
							
							figura[1][0].changeToBlack();
							
							figura[1][1].changeToBlack();
							
							
							ControlBorder(size, figura, figuraLength, Column, Row);
							
						};break;	
			
		
		
						case 9: {
							
							figuraLength = 7;
							
							figura = new fieldButtons[figuraLength][figuraLength];
							
							for(int i = 0; i < figuraLength; i++)
								
								for(int j = 0; j < figuraLength; j++)
									
									figura[i][j] = new fieldButtons();
							
							figura[1][1].changeToBlack();
							
							figura[1][2].changeToBlack();
							
							figura[1][3].changeToBlack();
							
							figura[1][4].changeToBlack();
							
							figura[1][5].changeToBlack();
							
							figura[2][0].changeToBlack();
							
							figura[2][2].changeToBlack();
							
							figura[2][3].changeToBlack();
							
							figura[2][4].changeToBlack();
							
							figura[2][6].changeToBlack();
							
							figura[3][1].changeToBlack();
							
							figura[3][5].changeToBlack();							
							
							figura[4][2].changeToBlack();
							
							figura[4][3].changeToBlack();
							
							figura[4][4].changeToBlack();							
							
							figura[5][3].changeToBlack();						
													
							ControlBorder(size, figura, figuraLength, Column, Row);
							
						};break;			
					}
					
			}
	}
	
	/**<p>
	 * Questo metodo ricopia le matrici contenenti le figure formate da putFigure sulla matrice di gioco
	 * lanciando la giusta eccezione quando si tenta di agire su bottoni al di fuori delle dimensioni
	 * dell'array bidimensionale
	 * 
	 * @param size fornisce la misura della matrice di gioco
	 * @param figura passa la matrice contenente la figura da esportare
	 * @param figuraLength passa le dimensioni della matrice quadrata della figura
	 * @param Column passa le coordinate del bottone premuto sulla matrice di gioco
	 * @param Row
	 */
	public static void ControlBorder(int size, fieldButtons[][] figura, int figuraLength, int Column, int Row){
		//posiziono le coordinate da cui far partire la copiatura della figura
		final int newRow = Row - figuraLength/2;
		
		final int newColumn = Column - figuraLength/2;
		//scorro tutta la matrice della figura e la ricopio sul quella principale
		for(int i = 0; i < figuraLength; i++)
			
			for(int j = 0; j < figuraLength; j++){
				
				if (newColumn+j <= size || newRow+i <= size || newColumn-j >= 0 || newRow-i >= 0)
					
					if(figura[i][j].isBlack()){
						//controllo di non disegnare all'infuori del bordo della matrice di gioco
						try{
							
						Field.buttons[newColumn+j][newRow+i].changeToBlack();
						
						}catch(ArrayIndexOutOfBoundsException e){};
					}
				
					
			}
	}
}
