package LecBoardDB.board.service;

import java.util.List;

import LecBoardDB.board.dao.BoardDAO;
import LecBoardDB.board.vo.BoardVO;

/*
       --->         ---> 
	UI      SERVICE      DAO
	   <---         <---
*/
public class BoardService {
	private BoardDAO boardDAO;

	public BoardService() {
		boardDAO = new BoardDAO();
	}
	
	public void insertBoard(BoardVO newBoard) {
		
		boardDAO.insertBoard(newBoard);
	}
	
	public List<BoardVO> selectAllBoard() {
		
		List<BoardVO> list = boardDAO.selectAllBoard();
		
		return list;
	}
	
	public BoardVO selectBoardByNo(int no) {
		
		BoardVO board = boardDAO.selectBoardByNo(no);
		return board;
		
	}
	
	public void modifyBoard(BoardVO board) {
		boardDAO.modifyBoard(board);
	}
	
	public void deleteBoardByNo(int no) {
		boardDAO.deleteBoardByNo(no);
	}
}










