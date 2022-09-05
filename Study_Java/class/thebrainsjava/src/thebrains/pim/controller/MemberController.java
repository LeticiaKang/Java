package thebrains.pim.controller;

import java.util.*;
import thebrains.pim.model.*;
import thebrains.pim.service.*;
import thebrains.pim.view.*;

public class MemberController {
	/* MVC(Model-View-Controller)
	// : �� ��� �������� ����(Personal Information System) ����
	// MVCS (+ Service)
	// CRUD(Create Read Update Delete) : �ڷḦ ó���ϴ� �⺻ ���
	   �߰� ��� : ����, �˻�, ������ */

	
//	��Ʈ�ѷ��� �޾Ƽ� ���� ���� �����͸� �����Ϸ��� ��
//  ��Ʈ�ѷ��� ��û�� �����Ұž�
//	��� ����� ������ �����ٰž�
//  ���� �����͸� �����ϴ� ����
//  ���񽺴� ��質 ������ó���� �̻��� �� �� ���°�
	
//================== ������ =======================
	public static Map<String, Member> session = new HashMap<String, Member>();
	public static TUIView tui = new TUIView();
	
//	MemberView memberView = null;
	MemberService<Member> memberService = null;
	final String MemberDB = "memberdb.txt";
//	public MemberController();
	
//================== �޼ҵ� =======================
	// �޼ҵ� 1 : �α��� ���/ ���ķ� � ����� �Ǿ�� �ұ�?
	
	public MemberController() {
		memberService = new MemberServiceimpl<Member>() ;
	}
	
	
	public void dispatch() {
		// dispatch��� ���� ������ �ǹ̰� ����; ������ ������
//		memberView = new MemberView();
//        memberView = new MemberView();
        Member sessionMember = null; // session�� ����� ��ü�� ó���ϴ� �� ���
        Member member = null; // �ӽ������� ����� ����
        
        boolean isLogin = false;
        boolean isRoot = false;
        
        memberService.readFile();//������ ������
		
		int menu = 0;
		// �����ڷ� �α��� �� ���� �ְ�, ����� �α��� �� �� ����
		// ���� : ������ ��, �α������� �� �Ϲݻ���ڳ� �����ڳ� 
		
		// true, true �� root �α���
		// true, false �� ����� �α���
		// false, * �� ��

		do { 
			sessionMember = session.get("member"); // �α��� ���� �� null�� �ƴ�
			
			if (sessionMember != null) {
                isLogin = true;
                if (sessionMember.getEmail().toString().equals("admin04@induk.ac.kr"))
                    isRoot = true;
            } else {
                isLogin = false;
                isRoot = false;
            }
			
			tui.showMenu(isLogin, isRoot);
			menu = tui.inputMenu();
//			System.out.println("�Է½� �޴�  = " + menu);
			switch (menu) {
			case 0:// ���� : �α׾ƿ�, ���Ϸ� ����
			    memberService.logout();
			    memberService.saveFile();
			    break;
			case 1:
				member = new Member();
			    member.setMno(MemberController.tui.inputMno()); // 1001�� �������� �ʴ� ���� �ذ�
			boolean isUnique; // �̸��� �ߺ� Ȯ��
			String email = MemberController.tui.inputEmail();
			member.setEmail(email);
			member.setPw(MemberController.tui.inputPw());
			member.setName(MemberController.tui.inputName());
			member.setPhone(MemberController.tui.inputPhone());
			member.setAddress(MemberController.tui.inputAddress());
			//             while (!isValid(member)) //��ȿ�� Ȯ��
			//                 ;
			if(memberService.postMember(member) > 0)
			     memberService.applyUpdate();
			else
//				memberView.printFail("��� ");
				break;
			case 2: // �α���
				sessionMember = memberService.login(tui.inputEmail(), tui.inputPw());
				break;
			}
		} while(menu != 0);
	}
		
	
}