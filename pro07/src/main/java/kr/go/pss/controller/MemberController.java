package kr.go.pss.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.go.pss.dto.MemberDTO;
import kr.go.pss.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@GetMapping("list")
	public String memberList(Model model)throws Exception{
		List<MemberDTO> memberList = memberService.memberList();
		model.addAttribute("memberList",memberList);
		return "member/list";
	}
	@GetMapping("detail")
	public String memberDetail(HttpServletRequest request, Model model) throws Exception {
		String id = (String)(request.getParameter("id"));
		MemberDTO dto = memberService.memberDetail(id);
		model.addAttribute("dto",dto);
		return "member/detail";
	}
	@GetMapping("edit")
	public String memberForm(@RequestParam("id") String id, Model model) throws Exception{
		MemberDTO dto = memberService.memberDetail(id);
		model.addAttribute("dto",dto);
		return "member/edit";
	}
	@PostMapping("edit")
	public String memberEdit(MemberDTO dto, Model model)throws Exception{
		memberService.memberEdit(dto);
		return "redirect:list";
	}
}
