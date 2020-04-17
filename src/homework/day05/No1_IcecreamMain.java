/* 실패작
package homework.day05;

*/
/*
1. 다음의 결과를 보이는 프로그램을 작성하시오.
        아이스크림을 몇개 구입할래? 3 (입력)

        *** 1번째 아이스크림 구매정보 ***
        아이스크림명 : 메로나 (입력)
        아이스크림가격 : 1000 (입력)

        *** 2번째 아이스크림 구매정보 ***
        아이스크림명 : 월드콘 (입력)
        아이스크림가격 : 2000 (입력)

        *** 3번째 아이스크림 구매정보 ***
        아이스크림명 : 비비빅 (입력)
        아이스크림가격 : 800 (입력)

< 총 3개의 아이스크림 구매정보 출력 >
        번호 아이스크림명 아이스크림가격
        1 메로나 1000
        2 월드콘 2000
        3 비비빅 800
*//*



        import java.util.Scanner;

public class No1_IcecreamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        No1_Icecream ice = new No1_Icecream();

        System.out.print("아이스크림을 몇개 구입할래? ");
        int n = sc.nextInt();
        System.out.println();

        String[] name = new String[n];
        int[] price = new int[n];

        for (int i = 1; i <= n; i++) {

            System.out.println("*** " + i+"번째 아이스크림 구매정보 ***");

            System.out.print("아이스크림명 : ");
            ice.name = sc.next();
            name[i-1] = ice.name;

            System.out.print("아이스크림가격 : ");
            ice.price = sc.nextInt();
            sc.nextLine();
            price[i-1] = ice.price;

            System.out.println();
        }


        System.out.println("< 총 " + n + "개의 아이스크림 구매정보 출력 >");
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.printf("%-5s %-10s %-10s\n","번호", "아이스크림명", "아이스크림가격");
            } else {
                System.out.printf("%-7d %-15s %-10d\n", i, name[i-1], price[i-1]);
            }
        }

    }
}

*/
