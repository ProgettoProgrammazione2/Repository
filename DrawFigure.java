package it.univr.GameOfLife;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;

public class DrawFigure extends JButton {
	
	public static int size = Field.buttons.length;
	public static fieldButtons[][] button;
	
	public static void putFigure(ActionEvent evento) {
		
		
		System.out.println("Sono arrivato in Draw");
		
		for(int i = 0; i < size; i++)
			for(int j = 0; j < size; j++){
				if(Field.buttons[i][j].isBlack())
					Field.nextGen[i][j].setBackground(Color.black);
				else
					Field.nextGen[i][j].setBackground(Color.white);
			}
		System.out.println("Ma allora funziona");
		
		for(int Row = 0; Row < size; Row++)
			for(int Column = 0; Column < size; Column++)
				if(evento.getSource() == Field.buttons[Column][Row]){
					//System.out.println("Ho trovato il pulsante");
					switch(SelectionWindow.WhichFigure) {
			
			
		
						case 1:{//posiziono la figura 1		
							System.out.println("Sono entrato in figura 1");
							Field.buttons[Column + 1][Row].setBackground(Color.black);	//costruisco la figura dal bottone di partenza
							Field.buttons[Column][Row].setBackground(Color.black);
							Field.buttons[Column - 1][Row].setBackground(Color.black);
							//SelectionWindow.bottone1.setBackground(Color.black);
							SelectionWindow.SetFigure = false;	
							System.out.println("Ho finito figura 1");//setto la variabile SetFigure a false per indicare che ho inserito la figura
						};break;
					
						case 2:{
							Field.buttons[Column + 1][Row].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
							Field.buttons[Column][Row].setBackground(Color.black);
							Field.buttons[Column][Row + 1].setBackground(Color.black);
							Field.buttons[Column][Row + 2].setBackground(Color.black);
							Field.buttons[Column + 1][Row + 1].setBackground(Color.black);
							Field.buttons[Column + 1][Row - 1].setBackground(Color.black);
							//SeletionWindow.ChangeIcon(2);
							SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					
						};break;
			
		
		
						case 3: {
							Field.buttons[Column -1][Row].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
							Field.buttons[Column - 1][Row - 1].setBackground(Color.black);
							Field.buttons[Column][Row - 1].setBackground(Color.black);
							Field.buttons[Column + 2][Row + 2].setBackground(Color.black);
							Field.buttons[Column + 1][Row + 2].setBackground(Color.black);
							Field.buttons[Column + 2][Row + 1].setBackground(Color.black);
							//SelectionWindow.bottone3.setBackground(Color.white);
							SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
						};break;
			
		
		
						case 4: {
							Field.buttons[Column+1][Row-3].setBackground(Color.black);
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
							
							
							
							
							//ChangeIcon(4);
							SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
						};break;
			
		
		
						case 5: {
							Field.buttons[Column-1][Row-1].setBackground(Color.black);
							Field.buttons[Column][Row+1].setBackground(Color.black);
							Field.buttons[Column][Row-1].setBackground(Color.black);
							Field.buttons[Column+1][Row].setBackground(Color.black);
							Field.buttons[Column+1][Row+1].setBackground(Color.black);
							//ChaneIcon(5);
							SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
						};break;
			
		
		
						case 6: {
							Field.buttons[Column-2][Row-1].setBackground(Color.black);
							Field.buttons[Column-2][Row+1].setBackground(Color.black);
							Field.buttons[Column-1][Row+2].setBackground(Color.black);
							Field.buttons[Column][Row+2].setBackground(Color.black);
							Field.buttons[Column+1][Row+2].setBackground(Color.black);
							Field.buttons[Column+1][Row-1].setBackground(Color.black);
							Field.buttons[Column+2][Row].setBackground(Color.black);
							Field.buttons[Column+2][Row+1].setBackground(Color.black);
							Field.buttons[Column+2][Row+2].setBackground(Color.black);						
							//ChangeIcon(5);
							SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
						};break;
			
		
		
						case 7: {
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
							//ChangeIcon(7);
							SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
						};break;
			
		
		
						case 8: {
							Field.buttons[Column][Row].setBackground(Color.black);
							Field.buttons[Column+1][Row].setBackground(Color.black);
							Field.buttons[Column][Row+1].setBackground(Color.black);
							Field.buttons[Column+1][Row+1].setBackground(Color.black);
							//ChangeIcon(8);
							SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
						};break;
			
		
		
						case 9: {
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
							SelectionWindow.SetFigure = false;
						};break;			
					}
			}
		//Field.ReadyToDraw = true;
		
		}
	}
	
