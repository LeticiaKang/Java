package kr.brain07;

public class Rectangle extends Polygon{

	public Rectangle(int length) {
		super(length, length);
//		super.setHeight(length); //������ ���� �� ������ 1���� super�� ���
//		super.setWidth(length);
		
	}
	
	@Override
	public int evaluate() {
		int area = getHeight()* getWidth();
		setName("Rectangle");
		return area;
	}

}