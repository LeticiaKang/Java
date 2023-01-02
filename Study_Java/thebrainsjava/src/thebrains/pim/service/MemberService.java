package thebrains.pim.service;
import java.util.*;

import thebrains.pim.controller.MemberController;
public interface MemberService<T> {
/* 2-1.�������̽� �� �����?
 * MemberService�� ���� Ȱ��� ���� ��û(����)
 */
	
	String memberdb = MemberController.MEMBER_DB;
	//��Ʈ�ѷ��� ���� ���� �ٽ� ��Ʈ�ѷ� ��
	
	T login(String email, String pw); // �α��� ó��
    void logout(); // �α׾ƿ� ó��
    int postMember(T member); // ȸ�� ���, http���� post �޼ҵ�� ó�� -> repository create
    // ������ �ϱ� ������ http�� �ַ� �����Ű�µ�, �׶�..
    // Hyper Text Transfer Protocol
    // http method�� ����(post, put, get, delete, patch, head..)
    
    T getMember(T member); // ȸ�� ���� ��ȸ, get �޼ҵ�� ó�� ->  repository read one
    List<T> getMemberList(); // ȸ�� ��� ��ȸ, get �޼ҵ�� ó�� -> repository read list
    int putMember(T member); // ȸ�� ���� ����, put �޼ҵ�� ó�� -> repository update
    int deleteMember(T member); // ȸ�� Ż��(����), delete �޼ҵ�� ó�� -> repository delete

//    List<T> findMemberByPhone(T member); // ��ȭ��ȣ �� 4�ڷ� �˻�, �������� �˻��� �� ����
//    List<T> sortByName(String order); // order�� desc �� ��������, asc�� ��������
//    List<T> paginateByPerPage(int pageNo, int perPage);

    void readFile(); // ���Ϸ� ���� �о ��� ��� ��ü ����
    void saveFile(); // ��� ��� ��ü�� ���Ͽ� ����
    void applyUpdate(); // saveFile() -> readFile() ������ ȣ���Ͽ� ó����. ���, ���� �� �߻�
	
}