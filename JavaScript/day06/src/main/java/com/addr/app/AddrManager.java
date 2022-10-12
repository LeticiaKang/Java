package com.addr.app;

import java.util.ArrayList;
import java.util.List;

public class AddrManager {
	// 주소록 목록을 관리하기 위한 ArrayList
	List<AddrBean> addrlist = new ArrayList<AddrBean>();
	public AddrManager() {
		AddrBean admin = new AddrBean();
		admin.setGrade("1");
		admin.setId("admin1");
		admin.setPwd("1234");
		admin.setUsername("관리자1");
		addrlist.add(admin);
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
	
	public boolean CheckUser(String id, String pwd){
		boolean result = false;
		for(AddrBean ab : addrlist) {
			if(ab.getId().equals(id) && ab.getPwd().equals(pwd))result = true;				
			else result = false;				
		}
		return result;
	}
	
}
