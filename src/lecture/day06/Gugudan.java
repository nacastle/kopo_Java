package lecture.day06;

import java.util.Scanner;

/**
 * 구구단과 관련된 기능을 가진 기능클래스
 * @author Na
 */

public class Gugudan {

    /**
     * 키보드로 하나의 단을 입력받아 호출자에게 넘겨주는 기능
     * @return 입력받은 단(int)
     * @autor Na
     */

    int getDan() {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        sc.nextLine();

        return dan;
    }

    int getDan(String msg) {
        System.out.print(msg);

        int dan = getDan();

//        Scanner sc = new Scanner(System.in);
//        int dan = sc.nextInt();
//        sc.nextLine();
        return dan;
    }


    /**
     * 시작단부터 종료단까지의 구구단 출력
     * @param startDan
     * @param endDan
     * @autor Na
     */

    void print(int startDan, int endDan) {

        for (int dan = startDan; dan <= endDan; dan++) {
            print(dan);
        }

    }



    /**
     * 호출자가 출력할 단을 넘겨주면 그 단의 구구단을 출력
     * @param dan 출력할 단
     */

    void print(int dan) {

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }
    }

    /**
     * 2~9단까지 모두 출력
     * @autor Na
     */
    void printAll() {
        for (int dan =2 ; dan <= 9; dan++) {
            for (int i = 1; i <=9; i++) {
                System.out.printf("%d * %d = %d\n", dan, i, dan*i);
            }
        }
    }

    void print() { // 오버로딩: 매개변수가 없는 print() != print(int i)


        for (int dan = 2; dan <=9; dan++) {
            print(dan); // print(int i) 클래스의 기능을 차용해올 수 있다.
        }

/*
        print(2);
        print(3);
        print(4);
        print(5);
        print(6);
        print(7);
        print(8);
        print(9);
*/

/*
        for (int dan =2 ; dan <= 9; dan++) {
            for (int i = 1; i <=9; i++) {
                System.out.printf("%d * %d = %d\n", dan, i, dan*i);
            }
        }
*/
    }







}
