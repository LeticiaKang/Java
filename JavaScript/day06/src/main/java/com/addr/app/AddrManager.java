package com.addr.app;

import java.util.ArrayList;
import java.util.List;

//회원관리와 관련된 기능을 제공하기 위한 클래스
//이곳에서 배열객체에 저장하고 불러오고 할 예정
public class AddrManager {
	// 주소록 목록을 관리하기 위한 ArrayList를 만들어줌
	List<AddrBean> addrlist = new ArrayList<>();
	
	// 관리자를 list에 기본으로 저장하는 코드
	public AddrManager() {
		AddrBean admin = new AddrBean();
		admin.setGrade("1");
		admin.setId("admin1");
		admin.setPwd("1234");
		admin.setUsername("관리자1");
		addrlist.add(admin);

		AddrBean user = new AddrBean();
		user.setGrade("0");
		user.setId("smart");
		user.setPwd("1234");
		user.setUsername("스마트");
		user.setGender("여");
		user.setTel("010-1234-1234");
		addrlist.add(user);
	}
	// 주소록 추가 메서드
	public void add(AddrBean ab) {
		addrlist.add(ab);
	}
	
	// 주소록 목록 전달 메서드
	public List<AddrBean> getAddrList() {
		return addrlist;
	}
	
	
	// 특정 사용자를 주소록 목록에서 검색하는 메서드
	public AddrBean getId(String id) {
		for(AddrBean ab : addrlist){
			if(ab.getUsername().equals(id))
				return null;
		}
		return null;
	}
	
	public AddrBean getPwd(String pwd) {
		for(AddrBean ab : addrlist) {
			if(ab.getUsername().equals(pwd))
				return null;
		}
		return null;
	}
	
	public String CheckUser(String id, String pwd){
		String name = null;
		for(AddrBean ab : addrlist) {
			if((ab.getId().equals(id)) && (ab.getPwd().equals(pwd))) {
				name = ab.getUsername();
				System.out.println("if " + name);
				return name;
			}else {			
				name = ab.getUsername();
				System.out.println("esle " + name);
			}
		}
		return name;
	}
	
}
