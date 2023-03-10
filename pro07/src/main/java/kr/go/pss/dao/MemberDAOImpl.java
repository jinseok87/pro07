package kr.go.pss.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.pss.dto.MemberDTO;
@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> memberList() throws Exception {

		return sqlSession.selectList("member.memberList");
	}

	@Override
	public MemberDTO memberDetail(String id) throws Exception {
		return sqlSession.selectOne("member.memberDetail",id);
	}

	@Override
	public void memberDelete(String id) throws Exception {
		sqlSession.delete("member.memberDelete",id);
	}

	@Override
	public void memberInsert(MemberDTO dto) throws Exception {
		sqlSession.insert("member.memberInsert",dto);
	}

	@Override
	public void memberEdit(MemberDTO dto) throws Exception {
		sqlSession.update("member.memberEdit",dto);
	}

	@Override
	public MemberDTO login(MemberDTO dto) throws Exception {
		return sqlSession.selectOne("member.login",dto);
	}

	@Override
	public MemberDTO loginCheck(MemberDTO dto) throws Exception {
		return  sqlSession.selectOne("member.loginCheck",dto);
	}

	@Override
	public MemberDTO ajaxLogin(MemberDTO dto) throws Exception {
		return sqlSession.selectOne("member.ajaxLogin",dto);
	}

}
