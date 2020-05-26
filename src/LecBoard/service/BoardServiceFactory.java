package LecBoard.service;

public class BoardServiceFactory {

	private static BoardService service = null;
	
	public static BoardService getBoardService() {
		
		if(service == null) {
			service = new BoardService();
		}
		
		return service;
	}
}
