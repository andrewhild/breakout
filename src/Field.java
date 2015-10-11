import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.Timer;


public class Field extends JPanel implements ActionListener, KeyListener{
	
	private static final int frameRate = 60;
	private HashMap<Point,Block> blocks;
	private Paddle paddle;
	private Ball b;
	private Timer timer;
	
	public Field(){
		timer = new Timer(100,this);
		timer.start();
		paddle = new Paddle(290,795,20,10,getWidth());
		System.out.println(this.getX());
		System.out.println(this.getY());
	}
	
	/**
	 * The big cookie that does most everything
	 */
	private void update(){
		//check win state
		//check and resolve collisions
		//paint
		paint(this.getGraphics());
	}
	
	/**
	 * Paints the updated game state, called every 1/frameRate seconds
	 * @param g
	 * 	The graphics context used to paint
	 */
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.GRAY);
		g.fillRect(paddle.x-paddle.length/2, paddle.y-paddle.height/2, paddle.length, paddle.height);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		
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
