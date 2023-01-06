package kr.go.pss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.pss.dao.MemberDAO;
import kr.go.pss.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberdao;

	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberdao.memberList();
	}

	@Override
	public MemberDTO memberDetail(String id) throws Exception {
		return memberdao.memberDetail(id);
	}

	@Override
	public void memberDelete(String id) throws Exception {
		memberdao.memberDelete(id);
	}

	@Override
	public void memberInsert(MemberDTO dto) throws Exception {
		memberdao.memberInsert(dto);
	}

	@Override
	public void memberEdit(MemberDTO dto) throws Exception {
		memberdao.memberEdit(dto);
	}

	@Override
	public MemberDTO login(MemberDTO dto) throws Exception {
		return memberdao.login(dto);
	}

	@Override
	public MemberDTO loginCheck(MemberDTO dto) throws Exception {
		return memberdao.loginCheck(dto);
	}

	@Override
	public MemberDTO ajaxLogin(MemberDTO dto) throws Exception {
		return memberdao.ajaxLogin(dto);
	}

}
