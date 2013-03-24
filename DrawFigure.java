package it.univr.GameOfLife;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;

public class DrawFigure extends JButton {
	
	public static int size = Field.buttons.length;
	public static fieldButtons[][] button;
	
	public static void putFigure(ActionEvent evento){
		
		for(int Row = 0; Row < size; Row++)
			for(int Column = 0; Column < size; Column++)
				if(evento.getSource() == Field.buttons[Column][Row]){
					//System.out.println("Ho trovato il pulsante");
					for(int i = 0; i < size; i++)
						for(int j = 0; j < size; j++){
							if(Field.buttons[i][j].isBlack())
								Field.nextGen[i][j].setBackground(Color.black);
							else
								Field.nextGen[i][j].setBackground(Color.white);
						}
					switch(SelectionWindow.WhichFigure) {
			
			
		
						case 1:{//posiziono la figura 1	
							try{
								Field.buttons[Column + 1][Row].setBackground(Color.black);	//costruisco la figura dal bottone di partenza
								Field.buttons[Column][Row].setBackground(Color.black);
								Field.buttons[Column - 1][Row].setBackground(Color.black);
							}catch(ArrayIndexOutOfBoundsException e){}
						
						};break;
					
						case 2:{
							try{
								Field.buttons[Column + 1][Row].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
								Field.buttons[Column][Row].setBackground(Color.black);
								Field.buttons[Column][Row + 1].setBackground(Color.black);
								Field.buttons[Column][Row + 2].setBackground(Color.black);
								Field.buttons[Column + 1][Row + 1].setBackground(Color.black);
								Field.buttons[Column + 1][Row - 1].setBackground(Color.black);
							}catch(ArrayIndexOutOfBoundsException e){}
					
						};break;
			
		
		
						case 3: {
							try{
							Field.buttons[Column -1][Row].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
							Field.buttons[Column - 1][Row - 1].setBackground(Color.black);
							Field.buttons[Column][Row - 1].setBackground(Color.black);
							Field.buttons[Column + 2][Row + 2].setBackground(Color.black);
							Field.buttons[Column + 1][Row + 2].setBackground(Color.black);
							Field.buttons[Column + 2][Row + 1].setBackground(Color.black);
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;
			
		
		
						case 4: {
							try{
								creaFigura(Column,Row);
							}catch(Exception OutOfBorde){}
						};break;
			
		
		
						case 5: {
							try{
							Field.buttons[Column-1][Row].setBackground(Color.black);
							Field.buttons[Column][Row+1].setBackground(Color.black);
							Field.buttons[Column+1][Row-1].setBackground(Color.black);
							Field.buttons[Column+1][Row].setBackground(Color.black);
							Field.buttons[Column+1][Row+1].setBackground(Color.black);
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;
			
		
		
						case 6: {
							try{
							Field.buttons[Column-1][Row-2].setBackground(Color.black);
							Field.buttons[Column-1][Row+1].setBackground(Color.black);
							Field.buttons[Column][Row+2].setBackground(Color.black);
							Field.buttons[Column+1][Row-2].setBackground(Color.black);
							Field.buttons[Column+1][Row+2].setBackground(Color.black);
							Field.buttons[Column+2][Row-1].setBackground(Color.black);
							Field.buttons[Column+2][Row].setBackground(Color.black);
							Field.buttons[Column+2][Row+1].setBackground(Color.black);
							Field.buttons[Column+2][Row+2].setBackground(Color.black);						
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;
			
		
		
						case 7: {
							try{
							Field.buttons[Column][Row+1].setBackground(Color.black);							
							Field.buttons[Column][Row-3].setBackground(Color.black);
							Field.buttons[Column][Row-2].setBackground(Color.black);
							Field.buttons[Column][Row].setBackground(Color.black);							
							Field.buttons[Column+1][Row-2].setBackground(Color.black);
							Field.buttons[Column+1][Row+1].setBackground(Color.black);
							Field.buttons[Column+1][Row].setBackground(Color.black);		
							Field.buttons[Column-1][Row-2].setBackground(Color.black);
							Field.buttons[Column-1][Row].setBackground(Color.black);
							Field.buttons[Column-1][Row+1].setBackground(Color.black);							
							Field.buttons[Column-2][Row-1].setBackground(Color.black);
							Field.buttons[Column-2][Row+1].setBackground(Color.black);						
							Field.buttons[Column+2][Row-1].setBackground(Color.black);
							Field.buttons[Column+2][Row+1].setBackground(Color.black);
							Field.buttons[Column-3][Row].setBackground(Color.black);
							Field.buttons[Column+3][Row].setBackground(Color.black);
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;
			
		
		
						case 8: {
							try{
							Field.buttons[Column][Row].setBackground(Color.black);
							Field.buttons[Column+1][Row].setBackground(Color.black);
							Field.buttons[Column][Row+1].setBackground(Color.black);
							Field.buttons[Column+1][Row+1].setBackground(Color.black);
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;
			
		
		
						case 9: {
							try{
							Field.buttons[Column][Row-1].setBackground(Color.black);							
							Field.buttons[Column][Row+3].setBackground(Color.black);
							Field.buttons[Column][Row+2].setBackground(Color.black);
							Field.buttons[Column][Row].setBackground(Color.black);							
							Field.buttons[Column+1][Row+2].setBackground(Color.black);
							Field.buttons[Column+1][Row-1].setBackground(Color.black);
							Field.buttons[Column+1][Row].setBackground(Color.black);		
							Field.buttons[Column-1][Row+2].setBackground(Color.black);
							Field.buttons[Column-1][Row].setBackground(Color.black);
							Field.buttons[Column-1][Row-1].setBackground(Color.black);							
							Field.buttons[Column-2][Row+1].setBackground(Color.black);
							Field.buttons[Column-2][Row-1].setBackground(Color.black);						
							Field.buttons[Column+2][Row+1].setBackground(Color.black);
							Field.buttons[Column+2][Row-1].setBackground(Color.black);
							Field.buttons[Column-3][Row].setBackground(Color.black);
							Field.buttons[Column+3][Row].setBackground(Color.black);
							}catch(ArrayIndexOutOfBoundsException e){}
						};break;			
					}
			}
		}
	private static void creaFigura(int Column, int Row){
		Field.buttons[Column+1][Row-3].changeToBlack();
		Field.buttons[Column+1][Row-2].setBackground(Color.black);
		Field.buttons[Column+1][Row+2].setBackground(Color.black);
		Field.buttons[Column+1][Row+3].setBackground(Color.black);
		Field.buttons[Column+2][Row-5].setBackground(Color.black);
		Field.buttons[Column+2][Row-3].setBackground(Color.black);
		Field.buttons[Column+2][Row-1].setBackground(Color.black);
		Field.buttons[Column+2][Row+1].setBackground(Color.black);
		Field.buttons[Column+2][Row+3].setBackground(Color.black);
		Field.buttons[Column+2][Row+5].setBackground(Color.black);
		Field.buttons[Column+3][Row-1].setBackground(Color.black);
		Field.buttons[Column+3][Row-2].setBackground(Color.black);
		Field.buttons[Column+3][Row-5].setBackground(Color.black);
		Field.buttons[Column+3][Row-6].setBackground(Color.black);
		Field.buttons[Column+3][Row-7].setBackground(Color.black);
		Field.buttons[Column+3][Row+1].setBackground(Color.black);
		Field.buttons[Column+3][Row+2].setBackground(Color.black);
		Field.buttons[Column+3][Row+5].setBackground(Color.black);
		Field.buttons[Column+3][Row+6].setBackground(Color.black);
		Field.buttons[Column+3][Row+7].setBackground(Color.black);
		Field.buttons[Column+5][Row-2].setBackground(Color.black);
		Field.buttons[Column+5][Row-3].setBackground(Color.black);
		Field.buttons[Column+5][Row+2].setBackground(Color.black);
		Field.buttons[Column+5][Row+3].setBackground(Color.black);
		Field.buttons[Column+6][Row-3].setBackground(Color.black);
		Field.buttons[Column+6][Row+3].setBackground(Color.black);
		Field.buttons[Column+7][Row-3].setBackground(Color.black);
		Field.buttons[Column+7][Row+3].setBackground(Color.black);
		
		Field.buttons[Column-1][Row-3].setBackground(Color.black);
		Field.buttons[Column-1][Row-2].setBackground(Color.black);
		Field.buttons[Column-1][Row+2].setBackground(Color.black);
		Field.buttons[Column-1][Row+3].setBackground(Color.black);
		Field.buttons[Column-2][Row-5].setBackground(Color.black);
		Field.buttons[Column-2][Row-3].setBackground(Color.black);
		Field.buttons[Column-2][Row-1].setBackground(Color.black);
		Field.buttons[Column-2][Row+1].setBackground(Color.black);
		Field.buttons[Column-2][Row+3].setBackground(Color.black);
		Field.buttons[Column-2][Row+5].setBackground(Color.black);
		Field.buttons[Column-3][Row-1].setBackground(Color.black);
		Field.buttons[Column-3][Row-2].setBackground(Color.black);
		Field.buttons[Column-3][Row-5].setBackground(Color.black);
		Field.buttons[Column-3][Row-6].setBackground(Color.black);
		Field.buttons[Column-3][Row-7].setBackground(Color.black);
		Field.buttons[Column-3][Row+1].setBackground(Color.black);
		Field.buttons[Column-3][Row+2].setBackground(Color.black);
		Field.buttons[Column-3][Row+5].setBackground(Color.black);
		Field.buttons[Column-3][Row+6].setBackground(Color.black);
		Field.buttons[Column-3][Row+7].setBackground(Color.black);
		Field.buttons[Column-5][Row-2].setBackground(Color.black);
		Field.buttons[Column-5][Row-3].setBackground(Color.black);
		Field.buttons[Column-5][Row+2].setBackground(Color.black);
		Field.buttons[Column-5][Row+3].setBackground(Color.black);
		Field.buttons[Column-6][Row-3].setBackground(Color.black);
		Field.buttons[Column-6][Row+3].setBackground(Color.black);
		Field.buttons[Column-7][Row-3].setBackground(Color.black);
		Field.buttons[Column-7][Row+3].setBackground(Color.black);
	}
	}
	
