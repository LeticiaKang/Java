package from_ch1_to_ch4;

import java.util.*;

public class ch4_3_Practice_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while(run) {
			// �⺻������ ��µǴ� ����
			System.out.println("-----------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			
			System.out.println("-----------------------");
			// ���ÿ� ���� �Է°� �ޱ�
			System.out.print("����> ");
			String choice = sc.nextLine();
	
/* ��������� 1 - if else�����������		
 
 
			// 1�� �Է��� ���
			if ( choice.equals("1")) {
				// ���ݾ� �Է¹ޱ�
				System.out.print("���ݾ�> ");
				// �ܾ׿� ���ϱ� * String�� Int�� �ٲ㼭 ���ؾ� �ϴ� �� ����
				balance += Integer.parseInt(sc.nextLine());
				System.out.printf("�ܾ� : %d\n", balance);
			}
			// 2�� �Է��� ���
			else if(choice.equals("2") ) {
				System.out.print("��ݾ�> \n");
				String money = sc.nextLine();
				// �ܾ׿� ���ϱ� * String�� Int�� �ٲ㼭 ���ؾ� �ϴ� �� ����
				balance -= Integer.parseInt(money);
				System.out.printf("�ܾ� : %d\n", balance);
			}
			// 3�� �Է��� ���
			else if(choice.equals("3") ) {
				System.out.printf("�ܰ�> %d\n", balance);
			}
			// 4�� �Է��� ���
			else {
				System.out.println();
				break;
			}
		
		System.out.println("���α׷� ����");
*/
//*�������������������				

//*��������� 2- switch�����������		

			switch(choice) {
			case "1":
				System.out.print("���ݾ� : ");
				int money_in = Integer.parseInt(sc.nextLine());
				balance += money_in;
				System.out.printf("���� �ܾ� : %d\n", balance);
				break;
			case "2":
				System.out.print("��ݾ� : ");
				int money_out = Integer.parseInt(sc.nextLine());
				balance -= money_out;
				System.out.printf("���� �ܾ� : %d\n", balance);
				break;
			case "3":
				System.out.printf("���� �ܾ� : %d\n", balance);
				break;
			default:
				System.out.println("\n---���α׷� ����---");
				run = false;
				break;
			}
//*�������������������				
		}
	}
}
