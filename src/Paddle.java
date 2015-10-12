
public class Paddle {

	private float vx = 0, vy = 0;
	int x, y, length, height, fieldSize;
	
	public Paddle(int x0, int y0, int w, int h, int fSize){
		x = x0;
		y = y0;
		length = w;
		height = h;
		fieldSize = fSize;
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
	 * 	The number of milliseconds that have passed since the last call to this method
	 */
	public void updatePosition(long elapsed){
		x += vx*elapsed/10;
		y += vy*elapsed/10;
		
		//Make sure the paddle cannot go offscreen
		if(x-length/2<=0)
			x=length/2;
		else if(x+length/2>=fieldSize)
			x = fieldSize-length/2;
	}

}
