package it.univr.GameOfLife;
import java.awt.Color;
import java.awt.event.*;


import javax.swing.JButton;

public class DrawFigure extends JButton {
	
	
	
	static final long serialVersionUID = 3000;
	public static int size = Field.buttons.length;		//mi servirà per scorrere tutti i bottoni e trovare quello premuto
	int figura1Length;
	public fieldButtons[][] figura; 
		
	public void putFigure(ActionEvent evento){
		
		
		
		for(int Row = 0; Row < size; Row++)
			for(int Column = 0; Column < size; Column++)
				if(evento.getSource() == Field.buttons[Column][Row]){			//trovo il bottone che ho premuto sulla matrice principale e ne salvo le coordinate
		
					switch(SelectionWindow.WhichFigure) {
					
						case 1:{
							//posiziono la figura 1	
							figura1Length = 3;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
									figura[i][j] = new fieldButtons();
							
							figura[1][0].changeToBlack();
							figura[1][1].changeToBlack();
							figura[1][2].changeToBlack();
							
							ControlBorder(size, figura, figura1Length, Column, Row);
														
						};break;
					
						case 2:{
							figura1Length = 4;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
									figura[i][j] = new fieldButtons();
							
							figura[0][2].changeToBlack();
							figura[1][1].changeToBlack();
							figura[1][2].changeToBlack();
							figura[2][1].changeToBlack();
							figura[2][2].changeToBlack();
							figura[3][1].changeToBlack();
							
							ControlBorder(size, figura, figura1Length, Column, Row);
							
						};break;
			
		
		
						case 3: {
							figura1Length = 4;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
									figura[i][j] = new fieldButtons();
							
							figura[0][0].changeToBlack();
							figura[0][1].changeToBlack();
							figura[1][0].changeToBlack();
							figura[2][3].changeToBlack();
							figura[3][2].changeToBlack();
							figura[3][3].changeToBlack();
							
							ControlBorder(size, figura, figura1Length, Column, Row);
							
						};break;
			
		
		
						case 4: {
							figura1Length = 15;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
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
													
							ControlBorder(size, figura, figura1Length, Column, Row);
						};break;
			
		
		
						case 5: {
							figura1Length = 3;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
									figura[i][j] = new fieldButtons();
							
							figura[1][0].changeToBlack();
							figura[2][1].changeToBlack();
							figura[0][2].changeToBlack();
							figura[1][2].changeToBlack();
							figura[2][2].changeToBlack();
							
							
							ControlBorder(size, figura, figura1Length, Column, Row);
							
						};break;
			
		
		
						case 6: {
							figura1Length = 5;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
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
							
							ControlBorder(size, figura, figura1Length, Column, Row);
							
						};break;
			
		
		
						case 7: {
							figura1Length = 7;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
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
							
							ControlBorder(size, figura, figura1Length, Column, Row);

							
						};break;
						
						
						
						case 8: {
							figura1Length = 2;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
									figura[i][j] = new fieldButtons();
							
							figura[0][0].changeToBlack();
							figura[0][1].changeToBlack();
							figura[1][0].changeToBlack();
							figura[1][1].changeToBlack();
							
							
							ControlBorder(size, figura, figura1Length, Column, Row);
							
						};break;	
			
		
		
						case 9: {
							figura1Length = 7;
							figura = new fieldButtons[figura1Length][figura1Length];
							
							for(int i = 0; i < figura1Length; i++)
								for(int j = 0; j < figura1Length; j++)
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
													
							ControlBorder(size, figura, figura1Length, Column, Row);
							
						};break;			
					}
					
			}
	}
	
	public static void ControlBorder(int size, fieldButtons[][] figura, int figuraLength, int Column, int Row){
		final int newRow = Row - figuraLength/2;
		final int newColumn = Column - figuraLength/2;
		for(int i = 0; i < figuraLength; i++)
			for(int j = 0; j < figuraLength; j++){
				if (newColumn+j <= size || newRow+i <= size || newColumn-j >= 0 || newRow-i >= 0)
					if(figura[i][j].isBlack()){
						try{
						Field.buttons[newColumn+j][newRow+i].changeToBlack();
						
						}catch(ArrayIndexOutOfBoundsException e){};
					}
				
					
			}
	}
}