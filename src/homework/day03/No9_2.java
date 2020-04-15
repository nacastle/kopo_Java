package homework.day03;
/*
9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
        반복문은 최대 3개만 사용합니다.
        2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
        2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
        ...
        5 * 1 = 5 6 7
        ...
        8 9

        for(int dan = 2; dan <= 9; ) {
        }
*/

import java.util.Scanner;

public class No9_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 단씩 출력하겠습니까 : ");
        int step = sc.nextInt();
        System.out.print("몇 단까지 출력하겠습니까 : ");
        int endDan = sc.nextInt();

        for (int dan = 2; dan <= endDan; dan += step) {

            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j < step && dan + j <= endDan; j++) {
                    if (i == 0) {
                        System.out.printf("*** %d단 ***\t", dan+j);
                    } else {
                        System.out.printf("%d * %d = %d\t", dan + j, i, (dan + j) * i);
                    }

                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }


}

