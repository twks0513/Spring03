package com.care.member.dao;

import java.util.ArrayList;

import com.care.member.dto.MemberDTO;

public class MemberDAO {
	ArrayList<MemberDTO> list;
	public MemberDAO() {
		list = new ArrayList<MemberDTO>();
	}
	
	public void regist(MemberDTO dto){			
		list.add(dto);		
	}
	public ArrayList<MemberDTO> member(){
		return list;
	}
}
