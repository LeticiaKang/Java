package from_ch1_to_ch4;

public class ch4_2_Practice_3 {

	public static void main(String[] args) {
		
		while (true) {

			int num1 = (int) ((Math.random() * 6) + 1);
			int num2 = (int) ((Math.random() * 6) + 1);
			int sum = num1 + num2;
			
			System.out.printf("�ֻ��� ��� : (%d, %d)\n �� : %d \n", num1, num2, sum);
			if (sum == 5) {
				break;
			}
			
/*			if ( sum != 5 ) {
				System.out.printf("�ֻ��� ��� : (%d, %d)\n �� : %d \n", num1, num2, sum);
				continue;
			}else {
				System.out.println("���� " +  sum + "�̹Ƿ� �����մϴ�.");
				break;
			}
*/
		}
		

	}

}
