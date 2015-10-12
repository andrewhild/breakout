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
	private Ball ball;
	private Timer timer;
	private long lastTime;
	
	public Field(){
		timer = new Timer(17,this);
		timer.start();
		paddle = new Paddle(290,795,30,10,600);
		ball = new Ball(0,0,0);
		addKeyListener(this);
		setFocusable(true);
		// enable openGL pipeline
		System.setProperty("sun.java2d.opengl", "True");
	}
	
	/**
	 * The big cookie that does most everything
	 */
	private void update(){
		//check win state
		//Update paddle and ball positions
		long newTime = System.currentTimeMillis();
		ball.updatePosition(newTime-lastTime);
		paddle.updatePosition(newTime-lastTime);
		lastTime = newTime;
		//check and resolve collisions
		//paint
		repaint();
	}
	
	/**
	 * Paints the updated game state, called every 1/frameRate seconds
	 * @param g
	 * 	The graphics context used to paint
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		g.fillRect(paddle.x-paddle.length/2, paddle.y-paddle.height/2, paddle.length, paddle.height);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_RIGHT)
			paddle.setVelocity(new float[] {5,0});
		else if(code==KeyEvent.VK_LEFT)
			paddle.setVelocity(new float[] {-5,0});
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if(code==KeyEvent.VK_RIGHT||code==KeyEvent.VK_LEFT)
			paddle.setVelocity(new float[] {0,0});
	}

	//Hooray and taz'dingo for vestigial methods
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
