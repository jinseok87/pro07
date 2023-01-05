package kr.go.pss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.pss.dao.BoardDAO;
import kr.go.pss.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
@Autowired
private BoardDAO boardDAO; 
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDAO.boardList();
	}

	@Override
	public BoardDTO boarDetail(int no) throws Exception {

		return boardDAO.boarDetail(no);
	}

	@Override
	public void boardInset(BoardDTO dto) throws Exception {
		boardDAO.boardInset(dto);
	}

	@Override
	public void boardDelete(int no) throws Exception {
		boardDAO.boardDelete(no);

	}

	@Override
	public void boardEdit(BoardDTO dto) throws Exception {
		boardDAO.boardEdit(dto);
	}

}
