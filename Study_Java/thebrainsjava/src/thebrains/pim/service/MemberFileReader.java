package thebrains.pim.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import thebrains.pim.model.Member;

public class MemberFileReader<T> {
	
	Scanner sc = null;
	
	public MemberFileReader(File f) throws FileNotFoundException {
		sc = new Scanner(f);
		//system.in : Ű����κ��� �Է�
		// f : ���Ϸκ��� �Է� ; ������ ���� ��츦 ����� fileException�ʿ�
	}
	
	
	public List<T> readMember() {
		List<T> memberList = new ArrayList<T>();
		
		while(sc.hasNext()) { 
			// Scanner�� ���� �� ���Ҵ�
			Member m = new Member();
			String strArr[] = sc.nextLine().split("\t"); 
			// �Ѱ��� ���ξ� tab ��ȣ�� �����ڷ� ����Ͽ� 6���� ��ҷ� ����
			m.setMno(Integer.parseInt(strArr[0]));
			// mno�� int��, -20�￡�� 20����� ��밡��
			
			// 6���� �ڷᰡ �ְ� member list�� �־����
			m.setEmail(strArr[1]);
			m.setPw(strArr[2]);
			m.setName(strArr[3]);
			m.setPhone(strArr[4]);
			m.setAddress(strArr[5]);
			memberList.add((T) m);
		}
		return memberList;
	}
}