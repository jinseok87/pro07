package kr.go.pss.service;

import java.util.List;

import kr.go.pss.dto.MemberDTO;

public interface MemberService {
//리스트
public List<MemberDTO> memberList() throws Exception;
//회원정보
public MemberDTO memberDetail(String id) throws Exception;
//회원탈퇴
public void memberDelete(String id) throws Exception;
//회원추가
public void memberInsert(MemberDTO dto) throws Exception;
//회원정보수정
public void memberEdit(MemberDTO dto) throws Exception;
//컨트롤러 로그인처리
public MemberDTO login(MemberDTO dto) throws Exception;
//로그인 DAO에서 처리
public MemberDTO loginCheck(MemberDTO dto) throws Exception;
//Ajax로그인
public MemberDTO ajaxLogin(MemberDTO dto) throws Exception;
}
