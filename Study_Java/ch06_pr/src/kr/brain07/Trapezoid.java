package kr.brain07;

public class Trapezoid extends Polygon{

	
	private int upper;
	
	public Trapezoid(int height, int width, int upper) {
		super(height, width);
		this.upper = upper;
	}
	
	public int evaluate() {
		int area = ( upper + getWidth() ) *  getHeight() / 2;
		return area;
}
	
//	public Trapezoid(int height,int bottom, int top) {
//		super(height, bottom, top);
//	}

	//	public int evaluate() {
//		int area = ( getTop() + getWidth() ) *  getHeight() / 2;
//		return area;
//	}
	
	
}
