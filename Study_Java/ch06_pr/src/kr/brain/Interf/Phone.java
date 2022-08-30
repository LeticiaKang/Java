package kr.brain.Interf;

public interface Phone {
	
	String PHONE_NUMBER = "010-1234-1234";
	// public static final 생략
	// 인터페이스에 선언된 모든 필드는 정적최종, 즉 상수변수
	
	void call(String phoneNumber);
	void receive();
}
