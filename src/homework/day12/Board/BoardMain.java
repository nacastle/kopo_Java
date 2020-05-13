/*
package homework.day12.Board;

*/
/*
 --------------------------------------------------
1. 전체게시물 조회
2. 글번호 조회
3. 글등록
4. 글수정
5. 글삭제
0. 종료
--------------------------------------------------

*//*



import java.util.Scanner;

public class BoardMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" --------------------------------------------------\n" +
                "1. 전체게시물 조회   \n" +
                "2. 글번호 조회   \n" +
                "3. 글등록   \n" +
                "4. 글수정   \n" +
                "5. 글삭제   \n" +
                "0. 종료     \n" +
                "--------------------------------------------------\n");

        while (true) {
            System.out.println("메뉴 중 처리할 항목을 선택하세요 : \n");
            int n = sc.nextInt();
            sc.nextLine();

            bdex.execute(n);
        }


    }
}
*/
