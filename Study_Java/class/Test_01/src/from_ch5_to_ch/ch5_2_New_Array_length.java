package from_ch5_to_ch;

public class ch5_2_New_Array_length {

	public static void main(String[] args) {
		
// =====================================================================//

		if(args.length != 2) {
			System.out.println("���� ���� �����մϴ�.");
			System.exit(0);
			/* if�� ������ ��� ���� ���� �����ϸ� ������ ���� ������
			 * ����Ż�� ������ System.exit�� ����Ѵ�.
			 * System.exit(0) : ���� ����
			 * System.exit(1) : ������ ����
			 * �����Ͱ� ����� ������� ���� ���� �־�, 
			 * ������ reture�� ����ϴ°� ����
			 */
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		/* run configuration �� Main - Arguments ��
		 * Program arguments �� �Է��ϱ� (����� ����)
		 * 
		 * �ٽ� �����ϸ� ���� 30���� ����
		 */


System.out.println("-----------------------------------------------");


	}

}
