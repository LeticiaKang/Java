package kr.brain.Interf;

public interface Phone {
	
	String PHONE_NUMBER = "010-1234-1234";
	// public static final ����
	// �������̽��� ����� ��� �ʵ�� ��������, �� �������
	
	void call(String phoneNumber);
	void receive();
}
