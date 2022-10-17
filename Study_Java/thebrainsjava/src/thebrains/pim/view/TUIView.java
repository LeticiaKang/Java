package thebrains.pim.view;

import thebrains.pim.model.Member;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TUIView {
	
	Member m = new Member();
	Scanner sc = new Scanner(System.in);
	
	public void showMenu(boolean isLogin, boolean isRoot) { // �޴� ����
		if(isLogin == false) { // �α��� ��
			System.out.print("0. ���� ");
			System.out.print("1. ��� ");
			System.out.print("2. �α��� ");
			System.out.print("\n");
		}
		else {
			if(isRoot == false) { // �α��� �� �Ϲ� �����
				System.out.print("3. ��ȸ ");
				System.out.print("4. ���� ");
				System.out.print("5. Ż�� ");
				System.out.print("6. �α׾ƿ� "); // isLogin�� false�� ����	
				System.out.print("\n");
			}
			else { // ������(true, true)
				System.out.print("0. ���� ");
				System.out.print("4. ���� ");
				System.out.print("6. �α׾ƿ� ");
				System.out.print("7. ��ü��� "); 
				System.out.print("8. ��ȭ��ȣ �˻� "); // ������ �������� �˻�
				System.out.print("9. �̸� �������� ����  "); // ������ �������� ����
				System.out.print("10.���� ���� page perCount");
				System.out.print("\n");
			}
		}		
	}

//========================== �α� �� �� ===============================
	
	public int inputMenu() { // �޴� �Է�
		int menu = 0 ;
		boolean flag = false;
		do {
			try {
/*���ں񱳸� �ؼ� Intȭ */
				menu = Integer.parseInt(sc.nextLine());
				if(menu < 0 || menu > 11 ) {
					System.out.println("�ش� �޴� ��ȣ�� �Է��Ͻÿ�.");
				}
				else
					flag = true;
		// ���ڸ� �Է��ؾ� �ϴµ� �ٸ��� �Է���
		// catch�� 2�� ���� ĳġ�Ǹ� �ڿ� ����
			} catch(InputMismatchException | NumberFormatException ime) { 
				System.out.println("���� ������ �Է��Ͻÿ�.");
			}
		} while(!flag);
		return  menu;
	}
	
	public int inputMno() {  // Mno
		System.out.println("�����ȣ >>");
		int mno = Integer.parseInt(sc.nextLine());
		return mno;
	}
	public String inputEmail() {
		System.out.println("�̸����� �Է��Ͻÿ�(id@induk.ac.kr) >>");
		String email = sc.nextLine();
		return email;
	}
	public String inputPw() {
		System.out.println("��ȣ�� �Է��Ͻÿ� >>");
		String mpw = sc.nextLine();
		return mpw;
	}
	public String inputName() {
		System.out.println("�̸��� �Է��Ͻÿ� >>");
		String mname = sc.nextLine();
		return mname;
	}
	public String inputPhone() {
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�(nnn-nnnn-nnnn) >>");
		String phone = sc.nextLine();
		return phone;
	}
	public String inputAddress() {
		System.out.println("�ּҸ� �Է��Ͻÿ� >>");
		String address = sc.nextLine();
		return address;
	}
	public int showUpdateMenu() {
		System.out.println("���� �׸� ��ȣ�� �Է��Ͻÿ� >>");
		System.out.print("0. ���� ���� ");
		System.out.print("1. �̸� ");
		System.out.print("2. �̸��� ");
		System.out.print("3. ����ó");
		System.out.print("4. �ּ� "); 
		return Integer.parseInt(sc.nextLine());
	}
}