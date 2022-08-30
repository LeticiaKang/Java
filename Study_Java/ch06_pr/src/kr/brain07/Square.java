package kr.brain07;

public class Square extends Polygon{

	public Square(int height, int width) {
		super(height, width);
	}
	
	@Override
	public int evaluate() {
		int area = getHeight()* getWidth();
		return area;
	}

}
