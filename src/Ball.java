
public class Ball {
	
	private float vx = 0, vy = 0;
	private int x, y, length, radius, fieldSize;
	
	public Ball(int x0, int y0, int r){
		x = x0;
		y = y0;
		radius = r;
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
	/**
	 * Update paddle position in response to player input
	 * @param elapsed
	 * 	The number of seconds that have passed since the last call to this method
	 */
	public void updatePosition(long elapsed){
		x += vx*elapsed;
		y += vy*elapsed;
		
		//Make sure the paddle cannot go offscreen
		if(x-length/2<0)
			x=length/2;
		if(x+radius>fieldSize)
			x = fieldSize-radius;
	}

}
