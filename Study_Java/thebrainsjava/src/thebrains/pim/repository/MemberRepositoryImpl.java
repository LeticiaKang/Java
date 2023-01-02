package thebrains.pim.repository;

import java.util.ArrayList;
import java.util.List;

import thebrains.pim.model.*;

public class MemberRepositoryImpl<T> implements MemberRepository<T>{

//1 ����Ʈ�� memberList��� ���� �ϳ� ����ð�(�����ϴ°ſ���)
	// �Ʒ��� �߿��� / ������ ������ ����� ��
		public List<T> memberList = null;
		public MemberRepositoryImpl() {
			memberList = new ArrayList<T>();
			//�޸𸮻󿡼� ȸ���������� �������ִ� 
			// �ᱹ �� ������ ���Ͽ� ����Ǵ�(������) �ſ���. �׷� ��ü�Դϴ�.
		}
   
	    @Override
	    public int create(T member) {
	        int ret = 0;
	        try {
	            memberList.add(member);
	            return 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return 0;
	        }
	    }
	    
	    
		@Override
		public T readByMno(T member) {
			// TODO Auto-generated method stub
			return null;
		}

//2 �������Ʈ ��ȯ�ϸ� �Ǳ���
		 public T readByEmail(T member) {
		        for(T m : memberList) {
		            if(((Member) m).getEmail().equals(((Member) member).getEmail()))
		                return m; // ù ��° email ���� ��Ҹ� ��ȯ
		        }
		        return null;
		    }
	
		@Override
		public List<T> readList() {
			return getMemberList();
		}
	
		@Override
		public int update(T member) {
			// TODO Auto-generated method stub
			return 0;
		}
	
		@Override
		public int delete(T member) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<T> getMemberList() {
			// TODO Auto-generated method stub
			return memberList;
		}

// 3 �׸��� memberList�� ���� ���� ������ �ּ���
		@Override
		public void setMemberList(List<T> memberList) {
	        this.memberList = memberList;
    }

	
}