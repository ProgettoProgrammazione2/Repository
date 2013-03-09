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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Field extends JFrame{

	private static int sizeSelected[] = new int[2];			//le dimensioni selezionate dall'utente
	
	private static boolean sizeSelect = false;					//vale true se l'utente ha selezionato la dimensione del frame
	
	private static boolean endSelect = false;					//vale true se ho effettivamente settato la dimensione del frame
	
	private static boolean radioButtonClicked = false;			//vale true se un radio button � stato selezionato
	
	private static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();	//variabile che assume i valori dello schermo
	
	private Container contentPane = getContentPane();
	
	private static fieldButtons[][] buttons, nextGen;							//i bottoni sul campo
	
	private static int gameSpeed = 1;							//velocit� di gioco
	
	private static boolean startTheGame = false;				//quando vale true il gioco parte
	
	private static boolean firstTime = true;
	
	private static final int[] velocity = {2000,1500,1000,700,600,500,400,200,100,50};

	private static JLabel generations;
	
	private static int generationNumber = 0;
	
	private boolean pause = false;
	
	private boolean isEmpty = false;
	
	private Widget menu;
	
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
		menu = new Widget();
		
		this.setVisible(true);
		
		//inizio il gioco
		start(buttons);
		
		
	}
	private void start(fieldButtons[][] buttons){
		Controllers[] c = new Controllers[5];
		int i = 0;
		int j = 1;
		int num = buttons.length/5;
		do{
			while(!startTheGame){
				sleepFor(5);
			}
			setButtons();
			//ipotizzo che questa sia l'ultima
			isEmpty = true;
			//azzero la nextGen
			while(pause){
				sleepFor(200);
			}
			for(fieldButtons[] b : nextGen){
				for(fieldButtons butt : b){
					butt.changeToWhite();
				}
			}
			i = 0;
			j = 1;
			for(int x = 0; x < c.length; x++){
				c[x] = new Controllers(i*num,(j*num) - 1);
				c[x].start();
				i++;
				j++;
			}
			for(Controllers co : c){
				co.run();
				try {
					co.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(i = 0; i < buttons.length; i++){
				for(j = 0; j < buttons[0].length; j++){
					if(nextGen[i][j].isBlack()){
						buttons[i][j].changeToBlack();
						isEmpty = false;
					}else{
						buttons[i][j].changeToWhite();
					}
				}
			}
			generationNumber++;
			generations.setText("GENERAZIONE #" + generationNumber);
			repaint();
			sleepFor(velocity[gameSpeed - 1]);
			if(isEmpty){
				generations.setBounds(50,150,200,20);
				generations.setText("GENERAZIONI TERMINATE");
				startTheGame = false;
				for(i = 0; i < buttons.length; i++){
					for(j = 0; j < buttons[0].length; j++){
						buttons[i][j].isInGame(false);
					}
				}
				generationNumber = 0;
				sleepFor(2000);
				generations.setBounds(70,150,200,20);
				generations.setText("GENERAZIONE #");
			}
		}while(true);
												//devo far capire ai bottoni che sono in gioco
	}
	private void setButtons(){
		for(fieldButtons[] rowButtons : buttons){
			for(fieldButtons p : rowButtons){
				p.isInGame(true);
			}
		}
	}
	public void sleepFor(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
		}
	}
	private void createButtons(int x, int y){
		int xButtons = (int)x/10;							//numero di bottoni orrizzontali
		int yButtons = (int)y/10;							//numero di bottoni verticali
		int i=0;
		int j=0;
		buttons = new fieldButtons[xButtons][yButtons];
		nextGen = new fieldButtons[xButtons][yButtons];
		for(i = 0; i < xButtons; i++){
			for(j = 0; j < yButtons; j++){
				buttons[i][j] = new fieldButtons();
				nextGen[i][j] = new fieldButtons();
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
		int xLocation = ((int)screen.getWidth()/2) - (x/2);	//coordinate per spostare le finestre al centro dello schermo
		int yLocation = ((int)screen.getHeight()/2) - (y/2);
		this.setSize(xSize, ySize);
		this.setResizable(false);							//non � modificabile
		setLocation(xLocation,yLocation);
		
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
			JButton bottoneOK = new JButton("OK");
			//creo i 3 JRADIOBUTTON
			JRadioButton r1 = new JRadioButton("250x250");
			JRadioButton r2 = new JRadioButton("500x500");
			JRadioButton r3 = new JRadioButton("750x750");
			//creo e aggiungo il listener dei radiobutton
			ActionListener listener = new JRadioButtonListener();
			r1.addActionListener(listener);
			r2.addActionListener(listener);
			r2.addActionListener(listener);
			
			//imposto la grandezza del frame
			setBounds(100,200,400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//lo sposto al centro dello schermo
			int xLocation = ((int)screen.getWidth()/2) - 100; //valori pressoch� casuali, da testare su computer diversi
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
			bottoneOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sizeSelect = true;
				}
				
			});
			setResizable(false);
			pack();
			this.setVisible(true);
			while(!sizeSelect){//finch� non premo il bottone
				if(radioButtonClicked){//se un radioButton � stato spuntato
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
			}else if(r2.isSelected() ){
				sizeSelected[0]=500;
				sizeSelected[1]=500;
			}else if(r3.isSelected()){
				sizeSelected[0]=750;
				sizeSelected[1]=750;
			}else{
				sizeSelected[0]=500;
				sizeSelected[1]=500;
			}
			this.setVisible(false);
			endSelect = true;
			this.dispose();				//libero le risorse che utilizzava
		}
	}
	private class Controllers extends Thread{
		private int start, end;
		public Controllers(int start, int end){
			this.start = start;
			this.end = end;
		}
		public void run(){
			int temp = 0;
			for(int i = start; i <= end; i++){
				for(int j = 0; j < buttons[0].length; j++){
					temp = check(i,j);
					if(temp == 3 && !buttons[i][j].isBlack()){
						nextGen[i][j].changeToBlack();
					}else if(temp !=3 && temp != 2 && buttons[i][j].isBlack()){
						nextGen[i][j].changeToWhite();
					}else{
						nextGen[i][j].setColor(buttons[i][j].getColor());
					}
				}
			}
		}
		public int check(int xPos,int yPos){
			int counter = 0;
			for(int i = -1;i < 2; i++){
				for(int j = -1; j < 2; j++){
					if(i != 0 || j != 0)
						try{
							if(buttons[xPos + i][yPos + j].isBlack()){
								counter++;
							}
						}catch(ArrayIndexOutOfBoundsException e){}
				}
			}
			return counter;
		}
	}
	private class JRadioButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			radioButtonClicked = true;
		}
	}
	/*
	 * La classe Widget permette di creare un frame che permette la gestione della velocit� di gioco
	 * la sua messa in pausa e la partenza del gioco stesso
	 * */
	private class Widget extends JFrame{
		private Widget(){
			super("Strumenti di gioco");
			
			int xLocation = 0;//in questo modo si trover� sempre a fianco del frame
			
			if(sizeSelected[0] == 250){
				xLocation = ((int)screen.getWidth()/2) - 500;
			}else if(sizeSelected[0] == 500){
				xLocation = ((int)screen.getWidth()/2) - 600;
			}else{
				xLocation = ((int)screen.getWidth()/2) - 700;
			}
			Container contentPane = getContentPane();
			contentPane.setLayout(null);
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			//posiziono la finestra
			this.setSize(250,500);
			this.setResizable(false);
			this.setLocation(xLocation,200);
			
			//aggiungo label e scrollbar
			JLabel l1 = new JLabel("Imposta la velocit�");
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

			final JLabel selected = new JLabel("Velocit� selezionata: 1");
			selected.setBounds(60,120,200,20);
			
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
			    	  gameSpeed = source.getValue();
			    	  selected.setText("Velocit� selezionata: "+ gameSpeed);
			      }
			    });
			
			generations = new JLabel("GENERAZIONE # ");
			generations.setBounds(70,150,200,20);
			
			JButton quit = new JButton("ESCI");
			quit.setBounds(75,410,100,25);
			quit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}		
			});
			
			final JButton pausa = new JButton("PAUSA");
			pausa.setBounds(75,380,100,25);
			pausa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(pause){
						pause = false;
						pausa.setText("PAUSA");
					}else{
						pause = true;
						pausa.setText("RIPRENDI");
					}
				}		
			});
			
			//aggiungo il bottone start
			JButton start = new JButton("START");
			start.setBounds(75,350,100,25);
			start.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					startTheGame = true;
					if(firstTime){			//se � la prima volta che lo premo
						setButtons();
						firstTime=false;
					}
				}
				
			});
			
			//aggiungo i componenti
			contentPane.add(l1);
			contentPane.add(slider);
			contentPane.add(quit);
			contentPane.add(start);
			contentPane.add(pausa);
			contentPane.add(generations);
			contentPane.add(selected);
			
			this.setVisible(true);
		}
	}
}
