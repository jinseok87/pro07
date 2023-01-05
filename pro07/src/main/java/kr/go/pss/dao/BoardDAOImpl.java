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
//����Ʈ
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}
//��������
	@Override
	public BoardDTO boarDetail(int no) throws Exception {
		return sqlSession.selectOne("board.boardDetail");
	}
//���߰�
	@Override
	public void boardInset(BoardDTO dto) throws Exception {
		sqlSession.insert("board.boardInsert");
	}
//�ۻ���
	@Override
	public void boardDelete(int no) throws Exception {
		sqlSession.delete("board.boardDelete");
	}
//�ۼ���
	@Override
	public void boardEdit(BoardDTO dto) throws Exception {
		sqlSession.update("board.boardEdit");
	}

}
