package from_ch1_to_ch4;

import java.util.*;

public class ch4_2_Study_for_while {

	public static void main(String[] args) {

/* �� for����
	for (�ʱ�ȭ��; ���ǽ�; ������(i++)) { ~}
	�� �ʱ�ȭ�İ� ������ ��� 2�� �̻��� ������ �� �� ����(��ǥ(,)�� ����)
*/		
System.out.println("-----1~100���� �� ���ϱ�----");
		int sum_1_100 = 0;
		for ( int x = 1; x < 101; x++) {
			sum_1_100 += x;
		}
		System.out.println(sum_1_100);
/*		
System.out.println("-----���ϴ� ���� ������ �����----");
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է��ϼ���!  ");
		int mul_num = sc.nextInt();
		
		for ( int a = 1; a < 10; a++) {
			int mul_table = a * mul_num;
			System.out.printf("%d x %d = %d\n", mul_num, a, mul_table);
		}
*/		
System.out.println("-----��ü ������ �����----");
		
		Stop : for (int b = 1; b < 10; b++) {
			System.out.println("\n" + b + "�� ����~~");
			for ( int c = 1; c < 10; c++) {
				int mul_table = c * b;
				System.out.printf("%d x %d = %d\n", b, c, mul_table);
				if (b==6 && c == 9) {
					System.out.println("����");
					break Stop;
				}
			}
		}
		for (int b = 1; b < 10; b++) {
			System.out.println("\n" + b + "�� ����~~");
			for ( int c = 1; c < 10; c++) {
				int mul_table = c * b;
				System.out.printf("%d x %d = %d\n", b, c, mul_table);
				}
/*				if (b==6) {
					System.out.println("����");
					break;
			}*/
		} 


		
/* �� while����
	while (���ǽ�) { 
		���๮ 
	 		if (���ǽ�) { 
	 			���๮; 
	 			break;
	 		} 
	 }
 */		
System.out.println("-----while-if-break ����----");
System.out.println(" �� �ֻ����� 6�̸� �ߴ�, ���� ��Ʈ");
		while (true) {
			int dice_num = (int) ((Math.random() * 6) + 1);
			System.out.println("�ֻ����� �Ǹ�����~ ��ȣ�� " + dice_num + "�Դϴ�!!");
			
			if (dice_num == 6) {
				break;
			}
		}
		System.out.println("�����Դϴ�.");
	
System.out.println("-----¦�� ���ϱ� continue----");
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
