package from_ch1_to_ch4;

public class ch1_Study_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("학습목표");
		System.out.println("이름 : 강은정");
		System.out.println("목표 : JAVA 배우기\n");
		
		int hour = 2;
		int minute = 59;
		
		System.out.println(hour + "시" + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		
		System.out.println(totalMinute+"분");
		
/*	변수는 블록 어드서든 선언할 수 있지만,
	자신이 속한 블록 내부에서만 사용할 수 있다. */
		
		
		int v1 = 15;
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
		
//		int v3 = v1 + v2 + 5;
		/* v2는 if 블럭 안에서 선언된 변수기 때문에
		블럭 밖에서는 사용이 불가함 */
		
		// 가. 정수형
		// : int, long 두가지를 자주 사용(short, char, byte 도 있음)
		long number_long =8764827384923849L;
		// 대문자 L 필요!
//		int num_test = 291417847328471928391;
		
//		System.out.println(num_test);
 //    → num_test는 int로 정해놨기 때문에 변수 설정이 불가함
		System.out.println(number_long);

		// 나. 실수형
		// : 자료형은 float(F필수!), double(디폴트 자료형)
		
		double d1 = 123.5;
		double d2 = 1.234e2;
		// ▶ e2 는 10의 제곱을 의미
		
		System.out.println(d2);
		
		/* 2진수, 8진수와 16진수는 int로 표현
		 - 2진수 : 0b로 시작
		 - 8진수 : 0으로 시작
		 - 16진수 : 0x로 시작
		 */
		
		int octal = 23;
		int hex = 0xC;
		
		int t1 = 0b1011;  // 2진수
		int t2 = 0206;  // 8진수
		int t3 = 365;  // 10진수
		int t4 = 0x3;  // 16진수
		// print시 10진수로 출력됨
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		
		
		
}
	
}
