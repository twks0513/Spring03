package com.care.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.dto.MemberDTO;
import com.care.member.service.MemberService;

@Controller
@RequestMapping("mvcq")
public class MemberController {
	@Autowired MemberService ms;
	
	@GetMapping("**")
	public String index() {
		return "/member/index";
	}
	
	@RequestMapping("join")
	public String join() {		
		return "/member/join";
	}
	
	@PostMapping("join_chk")
	public String join_chk(String id,String pwd, String name) {
		ms.register(id, pwd,name);
		return "/member/index";
	}
	
	@GetMapping("members")
	public String members(Model model) {
		ms.members(model);
		return "/member/members";
	}
}
