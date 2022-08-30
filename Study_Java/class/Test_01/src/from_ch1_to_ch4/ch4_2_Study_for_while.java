package from_ch1_to_ch4;

import java.util.*;

public class ch4_2_Study_for_while {

	public static void main(String[] args) {

/* ◀ for문▶
	for (초기화식; 조건식; 증감식(i++)) { ~}
	※ 초기화식과 증감식 모두 2개 이상의 조건이 들어갈 수 있음(쉼표(,)로 구분)
*/		
System.out.println("-----1~100까지 합 구하기----");
		int sum_1_100 = 0;
		for ( int x = 1; x < 101; x++) {
			sum_1_100 += x;
		}
		System.out.println(sum_1_100);
/*		
System.out.println("-----원하는 단의 구구단 만들기----");
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요!  ");
		int mul_num = sc.nextInt();
		
		for ( int a = 1; a < 10; a++) {
			int mul_table = a * mul_num;
			System.out.printf("%d x %d = %d\n", mul_num, a, mul_table);
		}
*/		
System.out.println("-----전체 구구단 만들기----");
		
		Stop : for (int b = 1; b < 10; b++) {
			System.out.println("\n" + b + "단 시작~~");
			for ( int c = 1; c < 10; c++) {
				int mul_table = c * b;
				System.out.printf("%d x %d = %d\n", b, c, mul_table);
				if (b==6 && c == 9) {
					System.out.println("종료");
					break Stop;
				}
			}
		}
		for (int b = 1; b < 10; b++) {
			System.out.println("\n" + b + "단 시작~~");
			for ( int c = 1; c < 10; c++) {
				int mul_table = c * b;
				System.out.printf("%d x %d = %d\n", b, c, mul_table);
				}
/*				if (b==6) {
					System.out.println("종료");
					break;
			}*/
		} 


		
/* ◀ while문▶
	while (조건식) { 
		실행문 
	 		if (조건식) { 
	 			실행문; 
	 			break;
	 		} 
	 }
 */		
System.out.println("-----while-if-break 연습----");
System.out.println(" ※ 주사위가 6이면 중단, 종료 멘트");
		while (true) {
			int dice_num = (int) ((Math.random() * 6) + 1);
			System.out.println("주사위가 또르르륵~ 번호는 " + dice_num + "입니다!!");
			
			if (dice_num == 6) {
				break;
			}
		}
		System.out.println("종료입니다.");
	
System.out.println("-----짝수 구하기 continue----");
	/*	for ( int d = 1; d < 11; d++) {
			if ( d % 2 == 0) {
				System.out.println(d);
			}
		} */

		for ( int d = 1; d < 11; d++) {
			if ( d % 2 != 0) {
				continue;
			}
			System.out.println(d);
		}  
			
		int sum = 0;
		
		for (int x = 2; x<21; x+=2) {
			sum += x;
			System.out.printf("x : " + x +" / ");
			System.out.printf("sum : " + sum +"\n");
		}

		
}}
