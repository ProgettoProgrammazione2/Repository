package it.univr.GameOfLife;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DrawFigure extends JButton {
  
	
	public JButton PutFigure(int x, int y, JButton buttons[][]) {
		
		final int Row = x;
		final int Column = y;
		if (fieldButtons.UserHasToDraw){
			switch(SelectionWindow.WhichFigure) {
			
			
		
			case 1:{//posiziono la figura 1		
				buttons[Row][Column + 1].setBackground(Color.black);	//costruisco la figura dal bottone di partenza
				buttons[Row][Column].setBackground(Color.black);
				buttons[Row][Column - 1].setBackground(Color.black);
				//SelectionWindow.bottone1.setBackground(Color.black);
				SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
				}
					
			case 2:{
						buttons[Row][Column + 1].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
						buttons[Row][Column].setBackground(Color.black);
						buttons[Row + 1][Column].setBackground(Color.black);
						buttons[Row + 2][Column].setBackground(Color.black);
						buttons[Row + 1][Column + 1].setBackground(Color.black);
						buttons[Row - 1][Column + 1].setBackground(Color.black);
						//SelectionWindow.ChangeIcon(2);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
					
				}
			
		
		
			case 3: {
			
						buttons[Row][Column + 1].setBackground(Color.black);		//costruisco la figura dal bottone di partenza
						buttons[Row - 1][Column - 1].setBackground(Color.black);
						buttons[Row - 1][Column].setBackground(Color.black);
						buttons[Row + 2][Column + 2].setBackground(Color.black);
						buttons[Row + 2][Column + 1].setBackground(Color.black);
						buttons[Row + 1][Column + 2].setBackground(Color.black);
						//ChangeIcon(3);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
			}
			
		
		
			case 4: {
			
						buttons[Row-2][Column-1].setBackground(Color.black);
						buttons[Row-3][Column-1].setBackground(Color.black);
						buttons[Row+2][Column-1].setBackground(Color.black);
						buttons[Row+3][Column-1].setBackground(Color.black);
						buttons[Row-1][Column-2].setBackground(Color.black);
						buttons[Row-3][Column-2].setBackground(Color.black);
						buttons[Row-5][Column-2].setBackground(Color.black);
						buttons[Row+1][Column-2].setBackground(Color.black);
						buttons[Row+3][Column-2].setBackground(Color.black);
						buttons[Row+5][Column-2].setBackground(Color.black);
						buttons[Row-1][Column-3].setBackground(Color.black);
						buttons[Row-2][Column-3].setBackground(Color.black);
						buttons[Row-5][Column-3].setBackground(Color.black);
						buttons[Row-6][Column-3].setBackground(Color.black);
						buttons[Row-7][Column-3].setBackground(Color.black);
						buttons[Row+1][Column-3].setBackground(Color.black);
						buttons[Row+2][Column-3].setBackground(Color.black);
						buttons[Row+5][Column-3].setBackground(Color.black);
						buttons[Row+6][Column-3].setBackground(Color.black);
						buttons[Row+7][Column-3].setBackground(Color.black);
						buttons[Row-2][Column-5].setBackground(Color.black);
						buttons[Row-3][Column-5].setBackground(Color.black);
						buttons[Row+2][Column-5].setBackground(Color.black);
						buttons[Row+3][Column-5].setBackground(Color.black);
						
						buttons[Row-2][Column+1].setBackground(Color.black);
						buttons[Row-3][Column+1].setBackground(Color.black);
						buttons[Row+2][Column+1].setBackground(Color.black);
						buttons[Row+3][Column+1].setBackground(Color.black);
						buttons[Row-1][Column+2].setBackground(Color.black);
						buttons[Row-3][Column+2].setBackground(Color.black);
						buttons[Row-5][Column+2].setBackground(Color.black);
						buttons[Row+1][Column+2].setBackground(Color.black);
						buttons[Row+3][Column+2].setBackground(Color.black);
						buttons[Row+5][Column+2].setBackground(Color.black);
						buttons[Row-1][Column+3].setBackground(Color.black);
						buttons[Row-2][Column+3].setBackground(Color.black);
						buttons[Row-5][Column+3].setBackground(Color.black);
						buttons[Row-6][Column+3].setBackground(Color.black);
						buttons[Row-7][Column+3].setBackground(Color.black);
						buttons[Row+1][Column+3].setBackground(Color.black);
						buttons[Row+2][Column+3].setBackground(Color.black);
						buttons[Row+5][Column+3].setBackground(Color.black);
						buttons[Row+6][Column+3].setBackground(Color.black);
						buttons[Row+7][Column+3].setBackground(Color.black);
						buttons[Row-2][Column+5].setBackground(Color.black);
						buttons[Row-3][Column+5].setBackground(Color.black);
						buttons[Row+2][Column+5].setBackground(Color.black);
						buttons[Row+3][Column+5].setBackground(Color.black);
						//ChangeIcon(4);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
			}
			
		
		
			case 5: {
						buttons[Row][Column-1].setBackground(Color.black);
						buttons[Row+1][Column].setBackground(Color.black);
						buttons[Row+1][Column+1].setBackground(Color.black);
						buttons[Row][Column+1].setBackground(Color.black);
						buttons[Row-1][Column+1].setBackground(Color.black);
						//ChangeIcon(5);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
			}
			
		
		
			case 6: {
						buttons[Row-2][Column-2].setBackground(Color.black);
						buttons[Row+1][Column-2].setBackground(Color.black);
						buttons[Row-2][Column].setBackground(Color.black);
						buttons[Row+2][Column].setBackground(Color.black);
						buttons[Row+2][Column-1].setBackground(Color.black);
						buttons[Row-1][Column+1].setBackground(Color.black);
						buttons[Row][Column+1].setBackground(Color.black);
						buttons[Row+1][Column+1].setBackground(Color.black);
						buttons[Row+2][Column+1].setBackground(Color.black);						
						//ChangeIcon(5);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
			}
			
		
		
			case 7: {
						buttons[Row][Column].setBackground(Color.black);
						buttons[Row+1][Column-1].setBackground(Color.black);
						buttons[Row+1][Column].setBackground(Color.black);
						buttons[Row+1][Column+1].setBackground(Color.black);
						buttons[Row+2][Column-2].setBackground(Color.black);
						buttons[Row+2][Column+2].setBackground(Color.black);
						buttons[Row+3][Column-3].setBackground(Color.black);
						buttons[Row+3][Column-1].setBackground(Color.black);
						buttons[Row+3][Column].setBackground(Color.black);
						buttons[Row+3][Column+1].setBackground(Color.black);
						buttons[Row+3][Column+3].setBackground(Color.black);
						buttons[Row+4][Column-2].setBackground(Color.black);
						buttons[Row+4][Column-1].setBackground(Color.black);
						buttons[Row+4][Column].setBackground(Color.black);
						buttons[Row+4][Column+1].setBackground(Color.black);
						buttons[Row+4][Column+2].setBackground(Color.black);
						//ChangeIcon(7);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
			}
			
		
		
			case 8: {
						buttons[Row][Column].setBackground(Color.black);
						buttons[Row][Column+1].setBackground(Color.black);
						buttons[Row+1][Column].setBackground(Color.black);
						buttons[Row+1][Column+1].setBackground(Color.black);
						//ChangeIcon(8);
						SelectionWindow.SetFigure = false;							//setto la variabile SetFigure a false per indicare che ho inserito la figura
			}
			
		
		
			case 9: {
						buttons[Row][Column].setBackground(Color.black);
						buttons[Row-1][Column-2].setBackground(Color.black);
						buttons[Row-1][Column-1].setBackground(Color.black);
						buttons[Row-1][Column].setBackground(Color.black);
						buttons[Row-1][Column+1].setBackground(Color.black);
						buttons[Row-1][Column+2].setBackground(Color.black);
						buttons[Row][Column-3].setBackground(Color.black);
						buttons[Row][Column-1].setBackground(Color.black);
						buttons[Row][Column+1].setBackground(Color.black);
						buttons[Row][Column+3].setBackground(Color.black);
						buttons[Row+1][Column-2].setBackground(Color.black);
						buttons[Row+1][Column+2].setBackground(Color.black);
						buttons[Row+2][Column-1].setBackground(Color.black);
						buttons[Row+2][Column].setBackground(Color.black);
						buttons[Row+2][Column+1].setBackground(Color.black);
						buttons[Row+3][Column].setBackground(Color.black);
						SelectionWindow.SetFigure = false;
				}
		
			}
		}
		return buttons[Row][Column];
	}
	
}
