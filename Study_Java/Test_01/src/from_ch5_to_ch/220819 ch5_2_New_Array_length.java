package from_ch5_to_ch;

public class ch5_2_New_Array_length {

	public static void main(String[] args) {
		
// =====================================================================//

		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
			/* if를 만족할 경우 다음 행을 실행하면 오류가 나기 때문에
			 * 강제탈출 종료인 System.exit를 사용한다.
			 * System.exit(0) : 정상 종료
			 * System.exit(1) : 비정상 종료
			 * 데이터가 제대로 실행되지 않을 수도 있어, 
			 * 가급적 reture를 사용하는게 좋다
			 */
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		/* run configuration → Main - Arguments →
		 * Program arguments 에 입력하기 (띄어쓰기로 구분)
		 * 
		 * 다시 실행하면 값이 30으로 나옴
		 */


System.out.println("-----------------------------------------------");


	}

}
