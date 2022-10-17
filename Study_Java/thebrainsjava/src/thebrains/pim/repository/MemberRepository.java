package thebrains.pim.repository;

import java.util.List;

public interface MemberRepository<T> {
	// DB�� �����ϴ� ����
	
	 // Generic�� �����. T�� Ÿ���Ķ���ͷ� ������ ������
    // MemberRepository ����ü - MemberRepositoryImpl�� �����ϱ� ���� ���α׷��� ���
    int create(T member); // ����, ���
    T readByMno(T member); // mno ��ȸ �ܼ�
    T readByEmail(T member); // email ��ȸ �ܼ�
    List<T> readList(); // ��ȸ ����
    int update(T member); // ����, ������Ʈ
    int delete(T member); // ����, Ż��


    // �޸� ó��, ���� ó�� or �����ͺ��̽� ó��
    List<T> getMemberList(); // ��� ��� ��ü�� ����
    void setMemberList(List<T> memberList); // ��� ��� ��ü�� ����
}