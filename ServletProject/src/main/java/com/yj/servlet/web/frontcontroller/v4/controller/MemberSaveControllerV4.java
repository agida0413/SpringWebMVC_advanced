package com.yj.servlet.web.frontcontroller.v4.controller;

import java.util.Map;

import com.yj.servlet.domain.member.Member;
import com.yj.servlet.domain.member.MemberRepository;
import com.yj.servlet.web.frontcontroller.ModelView;
import com.yj.servlet.web.frontcontroller.v3.ControllerV3;
import com.yj.servlet.web.frontcontroller.v4.ControllerV4;

public class MemberSaveControllerV4 implements ControllerV4{
	private MemberRepository memberRepository = MemberRepository.getInstance();
	@Override
	public String process(Map<String, String> paramMap, Map<String, Object> model) {
		// TODO Auto-generated method stub
		
		String username= paramMap.get("username");
		int age=Integer.parseInt(paramMap.get("age"));
		
		Member member = new Member(username, age);
		memberRepository.save(member);
		
		model.put("member", member);
		return "save-result";
		
	}

}
