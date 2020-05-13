package homework.day12.Board;

import java.util.Scanner;

public class BoardUtil extends Board {

    private Board boardList[];

    Scanner sc = new Scanner(System.in);

    public void newWrite(int num) {
        setNum(num);
        System.out.print("등록할 제목을 입력 : \n");
        super.setTitle(sc.nextLine());
        System.out.print("등록할 글쓴이를 입력 : \n");
        super.setWriter(sc.nextLine());

//        board.add(new Board(getNum(), getTitle(), getWriter(), getPostDate()); // getBoard나 setBoard로 안되는지?
        System.out.println("게시물이 등록되었습니다.");
    }

    public void edit() {
        System.out.print("수정할 글번호 입력 : ");
        super.setNum(sc.nextInt());
        System.out.println("글제목을 수정하세요.");
        super.setTitle(sc.nextLine());
        System.out.println("수정되었습니다.");
    }

    public void delete() {
        System.out.print("삭제할 글번호 입력 : ");
        super.setNum(sc.nextInt());
        System.out.println("삭제되었습니다.");
    }

    public void getPost() {
        System.out.println("조회할 글번호 입력 : ");
        super.setNum(sc.nextInt());


    }


}
