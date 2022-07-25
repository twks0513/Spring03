package com.care.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.member.dao.MemberDAO;
import com.care.member.dto.MemberDTO;

@Service
public class MemberService {
	@Autowired
	MemberDAO dao;
	
	public void register(String id,String pwd, String name) {
		MemberDTO dto = new MemberDTO();
		dto.setId(id); dto.setPwd(pwd);dto.setName(name);
		dao.regist(dto);
	}
	public void members(Model model) {
		ArrayList<MemberDTO> list = dao.member();
		model.addAttribute("list",list);
	}
}
