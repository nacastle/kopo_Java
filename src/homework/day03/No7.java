package homework.day03;
/*
7.
구구단을 출력하세요
        *** 2단 ***
        2 * 1 = 2
        ...
        2 * 9 = 18

        *** 3단 ***
        ...
        9 * 9 = 81
*/

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) { // 2- 9 단
            System.out.printf("*** %d단 ***\n", i);

            for (int j = 1; j <= 9; j++) { // 1- 9 까지 곱셈
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println(); // 한 단 끝나면 한 줄 띄기
        }
    }
}

