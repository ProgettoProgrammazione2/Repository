package it.univr.GameOfLife;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Field<SliderChangeListener> extends JFrame{
	
	private int sizeSelected[] = new int[2];			//le dimensioni selezionate dall'utente
	
	private boolean sizeSelect = false;					//vale true se l'utente ha selezionato la dimensione del frame
	
	private boolean endSelect = false;					//vale true se ho effettivamente settato la dimensione del frame
	
	private boolean radioButtonClicked = false;			//vale true se un radio button è stato selezionato
	
	private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();	//variabile che assume i valori dello schermo
	
	private Container contentPane = getContentPane();
	
	fieldButtons[][] buttons;							//i bottoni sul campo
	
	public Field(){
		super("The Game Of Life");
		
		//definisco come si deve comportare il frame se esco
		actionOnExit();		
		
		//container
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		//faccio definire all'utente le dimensioni iniziali
		startingOptions start = new startingOptions();
		
		//aspetto che l'utente finisca
		while(!endSelect);
		setDimension(sizeSelected[0],sizeSelected[1]);
		
		//creo i bottoni e li inserisco nel frame
		createButtons(sizeSelected[0],sizeSelected[1]);
		
		//creo il widget che mi permette di far partire il gioco;
		Widget menu = new Widget();
		this.setVisible(true);
	}
	private void createButtons(int x, int y){
		int xButtons = (int)x/10;							//numero di bottoni orrizzontali
		int yButtons = (int)y/10;							//numero di bottoni verticali
		int i=0;
		int j=0;
		buttons = new fieldButtons[xButtons][yButtons];
		for(i = 0; i < xButtons; i++){
			for(j = 0; j < yButtons; j++){
				buttons[i][j] = new fieldButtons();
				buttons[i][j].posizionaIn(i,j);
				contentPane.add(buttons[i][j]);
			}
		}
	}
	private void actionOnExit(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setDimension(int x, int y){
		int xSize = x;
		int ySize = y;
		System.out.print(x + "x" + y);
		int xLocation = ((int)screen.getWidth()/2) - (x/2);	//coordinate per spostare le finestre al centro dello schermo
		int yLocation = ((int)screen.getHeight()/2) - (y/2);
		this.setSize(xSize, ySize);
		this.setResizable(false);							//non è modificabile
		if(xSize==ySize){								//siamo nel caso delle impostazioni 250x250
					setLocation(xLocation,yLocation);	//o 500x500
		}
		
	}
	/*
	 * 
	 * Questa classe permette di definire la grandezza iniziale del form
	 * 
	 * */
	private class startingOptions extends JFrame{
		private startingOptions(){
			super("The Game Of Life");
			//bottone
			JButton bottoneOK = new JButton("Ok, procediamo");
			//creo i 3 JRADIOBUTTON
			JRadioButton r1 = new JRadioButton("250x250");
			JRadioButton r2 = new JRadioButton("500x500");
			JRadioButton r3 = new JRadioButton("Schermo intero");
			//creo e aggiungo il listener dei radiobutton
			ActionListener listener = new JRadioButtonListener();
			r1.addActionListener(listener);
			r2.addActionListener(listener);
			r2.addActionListener(listener);
			
			//imposto la grandezza del frame
			setBounds(100,200,400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//lo sposto al centro dello schermo
			int xLocation = ((int)screen.getWidth()/2) - 100; //valori pressochè casuali, da testare su computer diversi
			int yLocation = ((int)screen.getHeight()/2) - 100;
			setLocation(xLocation,yLocation);
			
			//aggiungo gli elementi al container
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(new JLabel("SELEZIONA UNA DIMENSIONE"), BorderLayout.NORTH);
			contentPane.add(r1,BorderLayout.WEST);
			contentPane.add(r2,BorderLayout.CENTER);
			contentPane.add(r3,BorderLayout.EAST);
			contentPane.add(bottoneOK,BorderLayout.SOUTH);

			//aggiungo un listener al bottone cosi quando clicco registro l'azione
			bottoneOK.addActionListener(new ClickButton());
			setResizable(false);
			pack();
			this.setVisible(true);
			while(!sizeSelect){//finchè non premo il bottone
				if(radioButtonClicked){//se un radioButton è stato spuntato
					if(r1.isSelected() ){
						r1.setSelected(true);
						r2.setSelected(false);
						r3.setSelected(false);
						sizeSelected[0]=250;
						sizeSelected[1]=250;
					}
					if(r2.isSelected() ){
						r2.setSelected(true);
						r3.setSelected(false);
						r1.setSelected(false);
						sizeSelected[0]=500;
						sizeSelected[1]=500;
					}
					if(r3.isSelected() ){
						r3.setSelected(true);
						r1.setSelected(false);
						r2.setSelected(false);
						sizeSelected[0]=1000;
						sizeSelected[1]=1000;
					}
				}
			};
			//250x250
			if(r1.isSelected() ){
				sizeSelected[0]=250;
				sizeSelected[1]=250;
			}
			//500x500
			if(r2.isSelected() ){
				sizeSelected[0]=500;
				sizeSelected[1]=500;
			}
			//schermo intero
			if(r3.isSelected()){
				
				sizeSelected[0]=(int)screen.getWidth();
				sizeSelected[1]=(int)screen.getHeight();
			}
			this.setVisible(false);
			endSelect = true;
		}
	}
	private class ClickButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			sizeSelect = true;
		}
		
	}
	private class JRadioButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			radioButtonClicked = true;
		}
	}
	/*
	 * La classe Widget permette di creare un frame che permette la gestione della velocità di gioco
	 * la sua messa in pausa e la partenza del gioco stesso
	 * */
	private class Widget extends JFrame{
		private Widget(){
			super("GameOfLife - Strumenti di gioco");
			Container contentPane = getContentPane();
			contentPane.setLayout(null);
			
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			//posiziono la finestra
			this.setSize(250,500);
			this.setResizable(false);
			this.setLocation(125,200);
			
			//aggiungo label e scrollbar
			JLabel l1 = new JLabel("Imposta la velocità");
			Hashtable<Integer, JLabel> labelTable = new Hashtable<Integer, JLabel>();
			labelTable.put(new Integer(1), new JLabel("1"));
			labelTable.put(new Integer(2), new JLabel("2"));
			labelTable.put(new Integer(3), new JLabel("3"));
			labelTable.put(new Integer(4), new JLabel("4"));
			labelTable.put(new Integer(5), new JLabel("5"));
			labelTable.put(new Integer(6), new JLabel("6"));
			labelTable.put(new Integer(7), new JLabel("7"));
			labelTable.put(new Integer(8), new JLabel("8"));
			labelTable.put(new Integer(9), new JLabel("9"));
			labelTable.put(new Integer(10), new JLabel("10"));
			l1.setBounds(70,50, 200, 25);

			final JLabel selected = new JLabel("Velocità selezionata: 1");
			selected.setBounds(57,120,200,20);
			
			JSlider slider = new JSlider(JSlider.HORIZONTAL,1,10,1);
			slider.setBounds(30, 70, 200, 40);
			slider.setPaintTicks(true);
			slider.setMajorTickSpacing(9);
			slider.setMinorTickSpacing(1);
			slider.setLabelTable(labelTable);
			slider.setPaintLabels(true);
			slider.addChangeListener(new ChangeListener() {
			      public void stateChanged(ChangeEvent e) {
			    	  JSlider source = (JSlider)e.getSource();
			    	  selected.setText("Velocità selezionata: "+ source.getValue());
			      }
			    });
			
			
			//aggiungo il bottone start
			JButton start = new JButton("START");
			start.setBounds(75,400,100,25);
			
			//aggiungo i componenti
			contentPane.add(l1);
			contentPane.add(slider);
			contentPane.add(start);
			contentPane.add(selected);
			
			this.setVisible(true);
		}
	}
}
