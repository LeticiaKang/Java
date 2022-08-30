package kr.brain.api;

public class Overriding {
	public void testEquals(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String) {
			// Object들의 비교는 같은 객체냐?
			if(((String) o1).equals((String) o2)) {
				System.out.println("두 문자열의 값이 같다.");
			}
			else
				System.out.println("두 문자열의 값이 다르다.");
		}
		else {
			// 값이 아닌 "같은 객체인지" 확인한다.
			if(o1.equals(o2)) {
				System.out.println("참조하는 객체가 같다.");
			}
			else
				System.out.println("참조하는 객체가 다르다.");
		}
		
		// ▶ Object를 상속받은 Integer는 equals를 "재정의(Overriding)"하고 있음.
		// 
	}

}
