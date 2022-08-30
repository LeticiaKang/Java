package from_ch1_to_ch4;

import java.util.*;

public class ch4_3_Practice_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while(run) {
			// 기본적으로 출력되는 문구
			System.out.println("-----------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			
			System.out.println("-----------------------");
			// 선택에 대한 입력값 받기
			System.out.print("선택> ");
			String choice = sc.nextLine();
	
/* ■■■■■■방법 1 - if else문■■■■■■■■		
 
 
			// 1을 입력한 경우
			if ( choice.equals("1")) {
				// 예금액 입력받기
				System.out.print("예금액> ");
				// 잔액에 더하기 * String을 Int로 바꿔서 더해야 하는 점 주의
				balance += Integer.parseInt(sc.nextLine());
				System.out.printf("잔액 : %d\n", balance);
			}
			// 2를 입력한 경우
			else if(choice.equals("2") ) {
				System.out.print("출금액> \n");
				String money = sc.nextLine();
				// 잔액에 더하기 * String을 Int로 바꿔서 더해야 하는 점 주의
				balance -= Integer.parseInt(money);
				System.out.printf("잔액 : %d\n", balance);
			}
			// 3를 입력한 경우
			else if(choice.equals("3") ) {
				System.out.printf("잔고> %d\n", balance);
			}
			// 4를 입력한 경우
			else {
				System.out.println();
				break;
			}
		
		System.out.println("프로그램 종료");
*/
//*■■■■■■종료■■■■■■■■				

//*■■■■■■방법 2- switch문■■■■■■■■		

			switch(choice) {
			case "1":
				System.out.print("예금액 : ");
				int money_in = Integer.parseInt(sc.nextLine());
				balance += money_in;
				System.out.printf("현재 잔액 : %d\n", balance);
				break;
			case "2":
				System.out.print("출금액 : ");
				int money_out = Integer.parseInt(sc.nextLine());
				balance -= money_out;
				System.out.printf("현재 잔액 : %d\n", balance);
				break;
			case "3":
				System.out.printf("현재 잔액 : %d\n", balance);
				break;
			default:
				System.out.println("\n---프로그램 종료---");
				run = false;
				break;
			}
//*■■■■■■종료■■■■■■■■				
		}
	}
}
