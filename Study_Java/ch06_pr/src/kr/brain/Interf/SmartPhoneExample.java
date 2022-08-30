package kr.brain.Interf;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		/* �������̽����� �����ϰ�,
		 * ���� ����(multiple implementation)�� ���� Ŭ������ ����
		 * ������ Ŭ�����κ��� ��ü�� �����ϰ�
		 * ������ ��ü�� ��ȣ�ۿ��� ���� ���� �ذ�
		 * 
		 * Java�� ���� ���(inheritance)�� ����X,
		 * �� extends�ڿ� 1���� ��� ����.
		 * 
		 * �������̽��� ���� ����(implementation)�� ����O,
		 * �� implements �ڿ� ������ ��� ����.
		 */
		
		SmartPhone stp = new SmartPhone();
		stp.call(SmartPhone.PHONE_NUMBER);
		stp.sendMsg("010-1234-1234", "�ȳ�!");
		stp.playMusic("������ - Cookies");
		stp.playBeep();
		Timer t = stp;
		// stp�� �����ϴ� ��ü��  
		// Timer �������̽��� ������ ����ü
		// Timer�������� ���⶧���� recievemsg �޼ҵ�� ������ ����
		((SmartPhone) t).call(SmartPhone.PHONE_NUMBER);
	//	t.call(SmartPhone.PHONE_NUMBER);
		stp.call(SmartPhone.PHONE_NUMBER);
	}

}
