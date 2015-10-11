import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Breakout extends JFrame {

	/**
	 * @param args 
	 * 		might be used later
	 */
	public static void main(String[] args) {
		init();
	}
	
	/**
	 * Initializes the field object and displays the game
	 */
	private static void init(){
		JFrame game = new Breakout();
		JPanel field = new Field();
		field.setPreferredSize(new Dimension(600,800));
		game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		game.add(field);
		game.pack();
		game.setVisible(true);
	}

}
