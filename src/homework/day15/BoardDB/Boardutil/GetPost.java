package homework.day15.BoardDB.Boardutil;

import homework.day15.BoardDB.Board;
import homework.day15.BoardDB.Post;

import java.util.Scanner;

public class GetPost extends Board {

    private Scanner sc;

    public GetPost() {
        sc = new Scanner(System.in);
    }

    public void getPost() {

        if (getBoardList().size() != 0) {
            System.out.print(">조회할 게시글 번호를 입력하세요 : ");
            int postNum = sc.nextInt();
            sc.nextLine();

            int idx = getBoardList().indexOf(new Post(postNum, null, null)); // 해당되는 게시글 번호의 인덱스 구하기

            if (idx != -1) {
                System.out.printf("%-4s %-10s %-10s %-10s\n", "번호", "제목", "글쓴이", "등록일");
                System.out.printf("%-4d %-10s %-10s %-10s\n", postNum, getBoardList().get(idx).getPostTitle(), getBoardList().get(idx).getPostWriter(), getBoardList().get(idx).getPostDate());
            } else {
                System.out.println("조회한 게시글이 존재하지 않습니다.");
            }
        } else {
            System.out.println("게시글이 존재하지 않습니다.");
        }
    }

    public void getAllPosts() {

        if (getBoardList().size() != 0) {
            System.out.println("< 전체 게시글 조회 >");
            System.out.printf("%-4s %-8s %-8s %-10s\n", "번호", "제목", "글쓴이", "등록일");
            for (int i = 0; i < getBoardList().size(); i++) {
                System.out.printf("%-5d %-10s %-10s %-10s\n", getBoardList().get(i).getPostNum(), getBoardList().get(i).getPostTitle(), getBoardList().get(i).getPostWriter(), getBoardList().get(i).getPostDate());
            }
        } else {
            System.out.println("게시글이 존재하지 않습니다.");
        }


    }
}
