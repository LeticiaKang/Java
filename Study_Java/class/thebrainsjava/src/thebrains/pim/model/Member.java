package thebrains.pim.model;

import java.util.Objects;

public class Member { // Model��ü���� Set,Getter ���� ���� ������
	// ��? �ڷḦ �ְ� ���� �� �� ������ �����̶� �׷�
	
//================= 1. �ʵ� ���� ===================
	
	private int mno; //��� ���� ��ȣ(Member Number) - unique, primary
	private String email; //�̸����� ���̵�� ����Ұž�, ���� 20 - unique
	private String pw;      //���� 15
	private String name;    //���� 15
	private String phone;   //���� 20
	private String address; //���� 50
	 
//========== 2. Getter, Setter�� ����� ==========	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
//========== 3. toString ��ü��  toStringȭ �ؼ� Ȯ�ο뵵�� ��� ==========	
	
	@Override
	public String toString() {
		return "Member [mno=" + mno + ", email=" + email + ", pw=" + pw + ", name=" + name + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
//========== 4. hashCode �� �������� Ȯ���Ϸ��� ����� ==========	
	/* �ؽ��Լ� : ���ѵ� ������ �ĺ��ڸ� ����� �Լ�
	 * ���� �����͸� ���� ������ �ĺ��� �� �ִ� �˰������� �����ž�
	 * 100���� ��� �ϸ� 50�� ������ ���� �� ������ �ؼ� ����..
	 * ù���ڷ� ����� ���� �ٿ�...
	 * 100%�� �ٸ��� ������ �� �ƴϾ� ���� ���� ���ü� ������ �幰��...
	 */
	
	@Override 
	public int hashCode() {
		return Objects.hash(email, mno, name);
	}
	
	@Override // �� ��ü�� ���������� ���� ����
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		
		return Objects.equals(email, other.email)
				&& mno == other.mno
				&& Objects.equals(name, other.name);
	}
	
//========== 5. hashCode �� �������� Ȯ���Ϸ��� ����� ==========	
	
	
	
	
}