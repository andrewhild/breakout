
public class Paddle {

	private float vx = 0, vy = 0;
	private int x, y;
	
	public Paddle(int x0, int y0){
		x = x0;
		y = y0;
	}
	
	/**
	 * Sets the velocity of the paddle to the specified 2-tuple
	 * @param args
	 * 	Contains magnitudes of the x and y velocity vectors
	 */
	public void setVelocity(float[] args){
		vx = args[0];
		vy = args[1];
	}
	

}
