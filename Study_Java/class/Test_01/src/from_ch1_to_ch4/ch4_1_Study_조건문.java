package from_ch1_to_ch4;

public class ch4_1_Study_���ǹ� {

	public static void main(String[] args) {
	/* �� ���� ���� ��
		 [ (Math.random() * ���� �ִ밪(�̸�)) + ������ ���ϴ� ��(�纯 ���� ����) ]�޼ҵ带 ��� 
		 document.write(Math.random()) : �Ҽ��� ���� ���� �ڸ����� ���� ����
	*/
		int time = (int) (Math.random() * 3) +8;
		System.out.println("[time : " + time + "��]" );
		
		switch(time) {
		case 8:
			System.out.println("����մϴ�.");               // �� break�� ���� ����
		case 9:																// ���ǿ� �´� case���� ���ʷ� ���
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ �մϴ�.");
		default:
			System.out.println("case�� ������ ����");
		}
		System.out.println("----------------------------");
		
		int time2 = (int) (Math.random() * 3) +8;
		System.out.println("[time2 : " + time + "��]" );
		switch(time2) {
		case 8:
			System.out.println("����մϴ�.");				 // ��break�� �־ 
			break;															// case ���ǿ� �´� ��¹��� ���
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 10:
			System.out.println("������ �մϴ�.");
			break;
		default:
			System.out.println("case�� ������ ����");
			break;
		}
		System.out.println("----------------------------");
		
// �� If-else If-else�� ��
		int score = 85;
		
		if (score >= 90) {
			System.out.println("������ 100~90�� �����Դϴ�.");
			System.out.println("��� A�Դϴ�");
		} else if(score >= 80) {
			System.out.println("������ 80~89�� �����Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else {
			System.out.println("������ 80�� �̸��Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		}
		System.out.println("----------�ֻ��� ��ȣ ���� ����(if)-----------");

		int number = (int) (Math.random() * 6) + 1;
		System.out.println("number : "+ number);
		
		if (number == 1) {
			System.out.println("1 �Դϴ�.");
		}else if (number == 2) {
			System.out.println("2 �Դϴ�.");
		}else if (number == 3) {
			System.out.println("3 �Դϴ�");
		}else if (number == 4) {
			System.out.println("4 �Դϴ�.");
		}else if (number == 5) {
			System.out.println("5 �Դϴ�.");
		}else {
			System.out.println("6 �Դϴ�.");
		}

		System.out.println("----------���޺� ���� �ȳ���(switch)-----------");
		String[] rank = {"����" , "����", " ���"};
		double random = (Math.random() * (rank.length-1));
		int num = (int) Math.round(random);
		
		switch(rank[num]) {
			case "����":
				System.out.println("700����");
			break;
			case "����":
				System.out.println("500����");
			break;
			default:
				System.out.println("300����");
			break;
		}
		System.out.println("������ : " + rank[num]);

		System.out.println("----------�޴� ����----------");
		String[] menu = {"�޹�", "������",  "������",  "�Ľ�Ÿ", "��������", "�ʹ�",  "�޲ٹ�",  "Į����",  "�ұ���", "������ �޴�(���ɽ�Ź)"};
		double today = Math.floor((Math.random() * (menu.length)));
		int today_int = (int) today;
		System.out.printf("���� �޴��� %s�Դϴ�!\n", menu[today_int]);
	
	}

}
