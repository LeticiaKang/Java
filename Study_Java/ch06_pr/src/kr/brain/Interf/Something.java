package kr.brain.Interf;

public class Something {
	// �ڹٽ�ũ��Ʈ, C�� �ʵ� ���� �޼ҵ� ����
	
	// ���CLASS�� �ֿ� Ư¡���
	// ĸ��ȭ�� ������(encapsulation)
	// �� �ڷ��߻�ȭ(data abstraction)
	//    : �ڷḦ ó���ϱ� ���� �ּ����� �������� ����� �� �ֵ��� ��
	//      ������ �κ��� ���� ����� ��  �ְԲ� �ϴ� ��(�߻������� �˷���)
	// �� ��������(Information hiding)
	//    : private�� ����θ� ���� �� ���������ڸ� ������ �������� ���� ����
	
	// OOP�� �ֿ� Ư¡ : ĸ��ȭ, ��Ӽ�, ������
	
	// �ڷᱸ��(Data Structure : ���)
	private String title;
	private String content;
	private String writer;
	private String regDate;
	
	//�ڷᱸ���� Ȱ���ϴ� �޼ҵ� : ���� & ����
	public void printAllFields() {
		 System.out.println(title);
		 System.out.println(content);
		 System.out.println(writer);
	}
	
}