package homework.day15.BoardDB.Boardutil;

import homework.day15.BoardDB.Board;
import homework.day15.BoardDB.Post;

import java.util.Scanner;

public class WritePost extends Board {

    private  Scanner sc;

    public WritePost() {
        sc = new Scanner(System.in);
    }

    public void writePost() {

        System.out.print(">등록할 제목을 입력: ");
        String postTitle = sc.nextLine();
        System.out.print(">등록할 글쓴이를 입력: ");
        String postWriter = sc.nextLine();
        getBoardList().add(new Post(getPostNum(), postTitle, postWriter));
        System.out.println("새로운 게시글이 생성되었습니다.");

    }
}
