package homework.day03;
/*
6.
단을 입력받아 구구단을 출력하세요
        2 - 9 단을 입력 : 6

        *** 6단 ***
        6 * 1 = 6
        6 * 2 = 12
        ...
        6 * 9 = 54
*/


import java.util.Scanner;

public class No06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("2 - 9 단을 입력 : ");
        int n = sc.nextInt();

        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                System.out.printf("*** %d단 ***\n", n);
            } else {
                System.out.printf("%d * %d = %d\n", n, i, n * i);
            }
        }

    }
}
