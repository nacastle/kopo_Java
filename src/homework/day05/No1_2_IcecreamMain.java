package homework.day05;

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
*/

import java.util.Scanner;

public class No1_2_IcecreamMain {
    public static void main(String[] args) {

        // 교수님 이번 과제는 제가 주석에 쓴 용어나 표현들이 올바른지 확인해주시면 감사하겠습니다!

        // 배열의 객체화 -> 배열 내 요소들의 객체화

        Scanner sc = new Scanner(System.in);

        System.out.print("아이스크림을 몇개 구입할래? ");
        int n = sc.nextInt();
        System.out.println();

        No1_Icecream[] iceArr = new No1_Icecream[n]; // No1_Icecream 클래스를 활용해 배열 형태의 iceArr 객체(인스턴스 객체) 생성

        for (int i = 0; i < n; i++) {

            iceArr[i] = new No1_Icecream(); // iceeArr 배열 내 각 요소의 인스턴스 객체화

            System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 ***");
            System.out.print("아이스크림명 : ");
//            iceArr[i].name = sc.nextLine();
//            질문: 48번 라인처럼 코드 짜면 콘솔창에서 입력하기도 전에 다음 입력으로 넘어가는데 왜 그러는지 잘 모르겠습니다...
            iceArr[i].name = sc.next(); // next()를 사용했을때만 잘 돌아갑니다... 하지만 띄어쓰기를 입력할 수 없다는 문제점이 있죠 ㅠ
            System.out.print("아이스크림가격 : ");
            iceArr[i].price = sc.nextInt();

            System.out.println();
        }

        System.out.println("< 총 " + n + "개의 아이스크림 구매정보 출력 >");
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.printf("%-5s %-10s %-10s\n", "번호", "아이스크림명", "아이스크림가격");
            } else {
                System.out.printf("%-7d %-15s %-10d\n", i, iceArr[i - 1].name, iceArr[i - 1].price);
            }
        }

    }


}
