package kr.brain.api;

public class Car {
	
	private double speed = 20;
	
	public void speedUP() {
		speed = speed * (1 + Math.random());
		// Math Ŭ����  : ���а���
		System.out.println("�ӵ� ����");
		
	}
}
