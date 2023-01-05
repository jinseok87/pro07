package kr.go.pss.dao;

import java.util.List;

import kr.go.pss.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO boarDetail(int no) throws Exception;
	public void boardInset(BoardDTO dto) throws Exception;
	public void boardDelete(int no) throws Exception;
	public void boardEdit(BoardDTO dto) throws Exception;
	}

