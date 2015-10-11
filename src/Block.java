import java.awt.Color;
import java.awt.Rectangle;


public class Block {

	private int x, y, len, wid;
	private Color color;
	
	/**
	 * 
	 * @param px
	 * 	x-coordinate of center
	 * @param py
	 * 	y-coordinate of center
	 * @param l
	 * 	length of block
	 * @param w
	 * 	width of block
	 * @param c
	 * 	color of block
	 */
	public Block(int px, int py, int l, int w, Color c){
		x = px;
		y = py;
		len = l;
		wid = w;
		color = c;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	/**
	 * Create a rectangle representation of a block. Note that rectangle length and width should almost
	 * certainly be an even number so that this doesn't break
	 * @return
	 * 	A Rectangle representing the block
	 */
	public Rectangle getRect(){
		return new Rectangle(x-len/2, y-wid/2, len, wid);
	}
	
	
}
