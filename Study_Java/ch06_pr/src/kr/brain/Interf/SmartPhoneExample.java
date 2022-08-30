package kr.brain.Interf;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		/* 인터페이스들을 정의하고,
		 * 다중 구현(multiple implementation)을 통해 클래스를 정의
		 * 저의한 클래스로부터 객체를 생성하고
		 * 생성된 객체와 상호작용을 통해 문제 해결
		 * 
		 * Java는 다중 상속(inheritance)은 지원X,
		 * 즉 extends뒤에 1개만 사용 가능.
		 * 
		 * 인터페이스는 다중 구현(implementation)이 가능O,
		 * 즉 implements 뒤에 여러개 사용 가능.
		 */
		
		SmartPhone stp = new SmartPhone();
		stp.call(SmartPhone.PHONE_NUMBER);
		stp.sendMsg("010-1234-1234", "안녕!");
		stp.playMusic("뉴진스 - Cookies");
		stp.playBeep();
		Timer t = stp;
		// stp가 참조하는 객체를  
		// Timer 인터페이스가 구현한 구현체
		// Timer관점으로 보기때문에 recievemsg 메소드는 나오지 않음
		((SmartPhone) t).call(SmartPhone.PHONE_NUMBER);
	//	t.call(SmartPhone.PHONE_NUMBER);
		stp.call(SmartPhone.PHONE_NUMBER);
	}

}
