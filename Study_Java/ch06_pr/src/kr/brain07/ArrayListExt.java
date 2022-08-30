package kr.brain07;


// ���� ���� ��Ű�� �ȿ� �ְų� java.lang��Ű�� �ȿ� �ִ� �� ����� import�� �ʿ��� 
// ������ String�� ��� ������ java.lang�� �־ �Ƚᵵ �Ǵ°ž�
import java.util.ArrayList;


// JCF : Java Collection Framework
// �����ϱ� ���� ���, ,�߻�Ŭ����, �������̽�, ���ʸ�(Generics)�� �˾ƾ� ����
public class ArrayListExt<T> extends ArrayList<T>{
	
	public void printHello() { 
		System.out.println("Ŭ����, ��ü, ����� ��ƴ�");
	}
	
	public boolean add() {
		System.out.println("������ ��� : �ڹ����α׷���");
		return true;
	}
	
	public int lastIndexOf(Object o) {
		System.out.println("������ �� : " + super.lastIndexOf(o));
		System.out.print("������ �� : ");
		return 100;
	}
	
	
	
}
