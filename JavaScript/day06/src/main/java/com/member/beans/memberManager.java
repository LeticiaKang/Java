package com.member.beans;

import java.util.ArrayList;

public class memberManager {
	
	ArrayList<MemberBeans> ml = new ArrayList<>();
	
	//멤버 추가하는 메소드
	public void add(MemberBeans member){
		//joinP에서 받은 정보를 ml이라는 어레이리스트에 추가
		ml.add(member);
	}
	
	public ArrayList<MemberBeans> getList(){
		return ml;
	}
	
}
