package from_ch1_to_ch4;

public class ch1_Study_char_bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ���� ����ǥ�� ���� ���� "���� ���ͷ�"�̶�� �Ѵ�.
		 * 
		 */
		
		char a1 = 'a';
		char a2 = 97;  //�ƽ�Ű�ڵ�� ǥ���� ��
		char a3 = '\u0061';  //�����ڵ�� ǥ���� ��
				
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		char c_10 = 65;  // A = �����ڵ� 10������ 65
		char c_16 = 0x0041; // A = 65�� 16������ ǥ��
		
		System.out.println(c_10);
		System.out.println(c_16);
		
		char t_char = 'B';
//		int t_int = 'AA'; 
	//  �� int���� ���ڸ� ������ �� ���� ������ error
		
		System.out.println("t_char : " + t_char);
//		System.out.println(t_int);
		
		boolean stop = true;
		if(stop) {
			System.out.println("�����մϴ�.");
			} 
		else {
				System.out.println("�����մϴ�.");
			}
		
		
	}

}