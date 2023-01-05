package kr.go.pss.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.pss.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
//리스트
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}
//상세페이지
	@Override
	public BoardDTO boarDetail(int no) throws Exception {
		return sqlSession.selectOne("board.boardDetail");
	}
//글추가
	@Override
	public void boardInset(BoardDTO dto) throws Exception {
		sqlSession.insert("board.boardInsert");
	}
//글삭제
	@Override
	public void boardDelete(int no) throws Exception {
		sqlSession.delete("board.boardDelete");
	}
//글수정
	@Override
	public void boardEdit(BoardDTO dto) throws Exception {
		sqlSession.update("board.boardEdit");
	}

}
