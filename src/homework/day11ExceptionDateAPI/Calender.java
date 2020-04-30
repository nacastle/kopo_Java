package homework.day11ExceptionDateAPI;

/*과제2>
        선택하세요(1. 특정년도   2. 특정월   3. 종료) => 1
        년도를 입력하세요 : 2020
        << 2020년 1월 >>
        일  월  화  수  목  금  토
        1   2   3   4
        5   6

        << 2020년 2월 >>

        << 2020년 12월 >>

        선택하세요(1. 특정년도   2. 특정월   3. 종료) => 2
        년도를 입력하세요 : 2020
        월을 입력하세요 : 1
        << 2020년 1월 >>
        일  월  화  수  목  금  토
        1   2   3   4
        5   6

        선택하세요(1. 특정년도   2. 특정월   3. 종료) => 3
        */

import java.util.Calendar;
import java.util.Scanner;

public class Calender {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();



        while (true) {

            System.out.print("선택하세요(1. 특정년도   2. 특정월   3. 종료) => ");
            int n = sc.nextInt(); // 숫자 선택
            sc.nextLine();

            if (n == 1) {
                System.out.print("년도를 입력하세요 : ");
                int selectYear = sc.nextInt();  // 년도 선택
                sc.nextLine();


                for (int month = 1; month <= 12; month++) { // 1월부터 12월까지

                    // 년 월 요일 타이틀
                    System.out.printf("<< %d년 %d월 >>\n", selectYear, month);
                    System.out.printf("%-2s%-2s%-2s%-2s%-2s%-2s%-2s\n", "일", "월", "화", "수", "목", "금", "토");

                    // 년 월 날짜 세팅
                    c.set(selectYear, month - 1, 1);

                    // 각 달의 1일 요일 구하기
                    int startDate = c.get(Calendar.DAY_OF_WEEK);

                    // 각 달의 마지막 일 구하기
                    int lastDay = c.getActualMaximum(Calendar.DATE);

                    // 각 달의 첫째주 출력문 구사하기
                    for (int i = 1; i < startDate; i++) {
                        System.out.print("   ");
                    }
                    for (int j = 1; j <= 7 - startDate + 1; j++) {
                        System.out.printf("%-3d", j);
                    }
                    System.out.println();

                    // 둘째주 이상의 주 출력문 구사하기
                    int cnt = 0;
                    for (int j = 7 - startDate + 2; j <= lastDay; j++) {
                        System.out.printf("%-3d", j);
                        cnt += 1;
                        if (cnt % 7 == 0) { // 일주일은 7일이므로 일곱번 출력해줬으면 다음줄로 넘어가기
                            System.out.println();
                        }
                    }

                    System.out.println();
                    System.out.println();

                }
            } else if (n == 2) {

                System.out.print("년도를 입력하세요 : ");
                int selectYear = sc.nextInt();  // 년도 선택
                System.out.print("월을 입력하세요 : ");
                int selectMonth = sc.nextInt();
                sc.nextLine();

                // 년 월 요일 타이틀
                System.out.printf("<< %d년 %d월 >>\n", selectYear, selectMonth);
                System.out.printf("%-2s%-2s%-2s%-2s%-2s%-2s%-2s", "일", "월", "화", "수", "목", "금", "토");
                System.out.println();
                // 년 월 날짜 세팅
                c.set(selectYear, selectMonth - 1, 1);

                // 각 달의 1일 요일 구하기
                int startDate = c.get(Calendar.DAY_OF_WEEK);

                // 각 달의 마지막 일 구하기
                int lastDay = c.getActualMaximum(Calendar.DATE);

                // 각 달의 첫째주 출력문 구사하기
                for (int i = 1; i < startDate; i++) {
                    System.out.printf("%3s", "");
                }
                for (int i = 1; i <= 7 - startDate + 1; i++) {
                    System.out.printf("%-3s", i);
                }
                System.out.println();

                // 둘째주 이상의 주 출력문 구사하기
                int cnt = 0;
                for (int i = 7 - startDate + 2; i <= lastDay; i++) {
                    System.out.printf("%-3s", i);
                    cnt += 1;
                    if (cnt % 7 == 0) { // 일주일은 7일이므로 일곱번 출력해줬으면 다음줄로 넘어가기
                        System.out.println();
                    }
                }
                System.out.println();


            } else if (n == 3) {
                System.out.println("종료되었습니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
