import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;


public class Field extends JPanel implements ActionListener, KeyListener{
	
	private static int frameRate = 60;
	private HashMap<Point,Block> blocks;
	private Paddle paddle;
	private Ball b;
	
	/**
	 * The big cookie that does most everything
	 */
	private void update(){
		
	}
	
	/**
	 * Paints the updated game state, called every 1/frameRate seconds
	 * @param g
	 * 	The graphics context used to paint
	 */
	public void paint(Graphics g){
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		
	}

	//Hooray and taz'dingo for vestigial methods
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
