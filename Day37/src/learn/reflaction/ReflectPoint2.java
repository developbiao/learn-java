/**
 * @Discribe:reflaction class
 */
package learn.reflaction;

public class ReflectPoint2 {
	
	public int x;
	public int y;
	private int var;
	public ReflectPoint2(int x, int y, int var) {
		super();
		this.x = x;
		this.y = y;
		this.var = var;
	}
	//Souce 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getVar() {
		return var;
	}
	public void setVar(int var) {
		this.var = var;
	}

}
