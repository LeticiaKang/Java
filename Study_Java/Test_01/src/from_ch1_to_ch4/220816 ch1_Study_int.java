package from_ch1_to_ch4;

public class ch1_Study_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�н���ǥ");
		System.out.println("�̸� : ������");
		System.out.println("��ǥ : JAVA ����\n");
		
		int hour = 2;
		int minute = 59;
		
		System.out.println(hour + "��" + minute + "��");
		
		int totalMinute = (hour * 60) + minute;
		
		System.out.println(totalMinute+"��");
		
/*	������ ��� ��弭�� ������ �� ������,
	�ڽ��� ���� ��� ���ο����� ����� �� �ִ�. */
		
		
		int v1 = 15;
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
		
//		int v3 = v1 + v2 + 5;
		/* v2�� if �� �ȿ��� ����� ������ ������
		�� �ۿ����� ����� �Ұ��� */
		
		// ��. ������
		// : int, long �ΰ����� ���� ���(short, char, byte �� ����)
		long number_long =8764827384923849L;
		// �빮�� L �ʿ�!
//		int num_test = 291417847328471928391;
		
//		System.out.println(num_test);
 //    �� num_test�� int�� ���س��� ������ ���� ������ �Ұ���
		System.out.println(number_long);

		// ��. �Ǽ���
		// : �ڷ����� float(F�ʼ�!), double(����Ʈ �ڷ���)
		
		double d1 = 123.5;
		double d2 = 1.234e2;
		// �� e2 �� 10�� ������ �ǹ�
		
		System.out.println(d2);
		
		/* 2����, 8������ 16������ int�� ǥ��
		 - 2���� : 0b�� ����
		 - 8���� : 0���� ����
		 - 16���� : 0x�� ����
		 */
		
		int octal = 23;
		int hex = 0xC;
		
		int t1 = 0b1011;  // 2����
		int t2 = 0206;  // 8����
		int t3 = 365;  // 10����
		int t4 = 0x3;  // 16����
		// print�� 10������ ��µ�
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		
		
		
}
	
}
