package homework.day04;
/*
1.
10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
        1's num : 12
        2's num : 5
        3's num : 8
        4's num : 30
        5's num : 22
        6's num : 87
        7's num : 9
        8's num : 4
        9's num : 15
        10's num : 22

< 짝수 >
 12 8 30 22 4 22
         짝수의 총합 : XXX

< 홀수 >
 5 87 9 15
         홀수의 총합 : XXX
*/

import java.util.Scanner;

public class No1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10개 정수 입력
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d's num : ", i + 1);
            arr[i] = sc.nextInt();
        }

        String[] title = {"짝수", "홀수"};
        for (int j = 0; j <= 1; j++) {
            System.out.println("<"+title[j]+">");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0 && arr[i] % 2 == j) { // 짝수, 홀수 인지 검증
                    System.out.printf("%-3d", arr[i]); //짝수, 홀수면 출력
                }
            }
            System.out.println();
        }
    }
}
