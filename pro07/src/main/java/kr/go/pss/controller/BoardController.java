package kr.go.pss.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.go.pss.dto.BoardDTO;
import kr.go.pss.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Autowired
	BoardService boardService;
//	����Ʈ
	@GetMapping("list")
	public String getboardList(Model model) throws Exception{
		List<BoardDTO> boardList = boardService.boardList();
		model.addAttribute("boardList",boardList);
		return "board/boardList";
	}
//	��������
	@GetMapping("detail")
	public String getboardDetail(HttpServletRequest request,Model model)throws Exception{
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO dto = new BoardDTO();
		model.addAttribute("dto", dto);
		return "board/boadrDetail";
	}
//	����������
	@GetMapping("edit")
	public String editForm(HttpServletRequest request, Model model)throws Exception{
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDTO dto = new BoardDTO();
		model.addAttribute("dto",dto);
		return "board/boardEdit";
	}
	
//����
	@PostMapping("Edit")
	public String boardEdit(HttpServletRequest request, Model model)throws Exception{
		BoardDTO dto = new BoardDTO();
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardEdit(dto);
		return "redirect:List";
	}
//	����
	@GetMapping("Delete")
	public String boardDelete(HttpServletRequest request, Model model) throws Exception{
		int no = Integer.parseInt(request.getParameter("no"));
		boardService.boardDelete(no);
		return "redirect:List";
		
	}
}
