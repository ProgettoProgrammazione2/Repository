package it.univr.GameOfLife;

import java.awt.Color;

public class Controller extends Thread{
	private fieldButtons[][] buttons;
	public Controller(fieldButtons[][] buttons){
		this.buttons = buttons;
	}
	public void run(){
		while(true){
			int height = buttons.length;//numero di righe
			for(int i = 0; i < height; i++){
				for(int j = 0; j < buttons[0].length; j++){
					if(check(buttons, i , j) == 3 && buttons[i][j].getColor().equals(Color.white)){
						buttons[i][j].changeToBlack();
					}else if(check(buttons, i , j) == 3 || check(buttons, i , j) == 2 && buttons[i][j].getColor().equals(Color.black)){
						return;
					}else{
						buttons[i][j].changeToWhite();
					}
				}
			}
		}
	}
		
	public void setButtons(fieldButtons[][] temp){
		this.buttons = temp;
	}
	
	public int check(fieldButtons[][] b,int xPos,int yPos){
		int counter = 0;
		for(int i = 0;i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i != xPos && j != yPos)
					try{
						if(b[i - 1][j - 1].getColor().equals(Color.black))
							counter++;
					}catch(ArrayIndexOutOfBoundsException e){}
			}
		}
		return counter;
	}
	public void sleepFor(int milliseconds) {
		try {
			System.out.println("SLEEP");
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
		}
	}
}
