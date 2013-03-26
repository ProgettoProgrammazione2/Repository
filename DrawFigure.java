package it.univr.GameOfLife;

import java.awt.Color;
import java.awt.event.*;


import javax.swing.JButton;

public class DrawFigure extends JButton {
	
	static final long serialVersionUID = 3000;
	public static int size = Field.buttons.length;		//mi servirà per scorrere tutti i bottoni e trovare quello premuto
		
	public void putFigure(ActionEvent evento){
		
		for(int Row = 0; Row < size; Row++)
			for(int Column = 0; Column < size; Column++)
				if(evento.getSource() == Field.buttons[Column][Row]){			//trovo il bottone che ho premuto sulla matrice principale e ne salvo le coordinate
					
					
					for(int i = 0; i < size; i++)
						for(int j = 0; j < size; j++){
							if(Field.buttons[i][j].isBlack())
								Field.nextGen[i][j].changeToBlack();
							else
								Field.nextGen[i][j].changeToBlack();
						}
		
					switch(SelectionWindow.WhichFigure) {
					
						case 1:{															//posiziono la figura 1	
							try{
								Field.buttons[Column + 1][Row].changeToBlack();	//costruisco la figura dal bottone di partenza,
							}catch(ArrayIndexOutOfBoundsException e){}						//utilizzo il controllo delle eccezioni così riesco
							try{															//a gestire le figure incomplete in prossimità dei bordi della
								Field.buttons[Column][Row].changeToBlack();		//matrice
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column - 1][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;
					
						case 2:{
							try{
								Field.buttons[Column + 1][Row].changeToBlack();		
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row + 1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row + 2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column + 1][Row + 1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column + 1][Row - 1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
					
						};break;
			
		
		
						case 3: {
							try{
								Field.buttons[Column -1][Row].changeToBlack();		//costruisco la figura dal bottone di partenza
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column - 1][Row - 1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row - 1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column + 2][Row + 2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column + 1][Row + 2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column + 2][Row + 1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							
						};break;
			
		
		
						case 4: {
							try{
								Field.buttons[Column+1][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row-5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row+5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row-5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row-6].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row-7].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row+5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row+6].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row+7].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+5][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+5][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+5][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+5][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+6][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+6][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+7][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+7][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
								
							try{
								Field.buttons[Column-1][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row-5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row+5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row-5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row-6].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row-7].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row+5].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row+6].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row+7].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-5][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-5][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-5][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-5][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-6][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-6][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-7][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-7][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;
			
		
		
						case 5: {
							try{
								Field.buttons[Column-1][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							
						};break;
			
		
		
						case 6: {
							try{
								Field.buttons[Column-1][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row+2].changeToBlack();	
							}catch(ArrayIndexOutOfBoundsException e){}
							
						};break;
			
		
		
						case 7: {
							try{
								Field.buttons[Column][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row-3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row].changeToBlack();	
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row-2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							
						};break;
			
		
		
						case 8: {
							try{
								Field.buttons[Column][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							
						};break;
			
		
		
						case 9: {
							try{
								Field.buttons[Column][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row+3].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+1][Row].changeToBlack();	
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row+2].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-1][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-2][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row+1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+2][Row-1].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column-3][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							try{
								Field.buttons[Column+3][Row].changeToBlack();
							}catch(ArrayIndexOutOfBoundsException e){}
							
						};break;			
					}
			}
	}
}