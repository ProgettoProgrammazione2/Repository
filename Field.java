package it.univr.GameOfLife;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Field extends JFrame{
	public Field(){
		super("The Game Of Life");
		actionOnExit();
	}
	public void actionOnExit(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
