package kr.brain07;

public class Parallelogram extends Polygon{

	public Parallelogram(int height, int width) {
		super(height, width);
	}

	@Override
	public int evaluate() {
		int area = getHeight()* getWidth() / 2;
		return area;
	}

}
