package kr.brain02;

// GugudanŬ������ package�� �ִ� ��� / import �Ǵ� ���(�ٸ� ��Ű�� �ִ� Ŭ������ �ҷ���)

public class SubGugudan extends Gugudan {
	// �����ܿ� �ִ� ��� �żҵ带 �����ͼ� �� �� �ִ�.
	
	
	public SubGugudan(int dan) {
		super(dan); 
		// default�� �����Ϸ��� �߰�
	}
		// this ���� Ŭ������ �����ڸ� ȣ��
		// super �θ�Ŭ������ �����ڸ� ȣ��
	
	public void printFrom(int dan, String direction) {
		// direction�� up, down�� ���� 
		// up dan : dan���� 9�ܱ��� ���
		//down dan :  2�ܺ��� dan���� ���
		// **** �żҵ带 ��ø�ߴ� ****
		
//		if (direction.equals("up")) {
//			gugudan1.printFrom(dan);
//		}else if(direction.equals("down")){
//			gugudan1.printEnd(dan);
//		}
	}
	
	
}