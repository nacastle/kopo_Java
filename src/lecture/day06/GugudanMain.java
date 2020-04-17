package lecture.day06;

import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("2~9 사이의 단을 입력 : ");
//        int n = sc.nextInt();
//        sc.nextLine();

        Gugudan gu = new Gugudan();

        int dan = gu.getDan("2-9사이의 단을 입력 : ");
        gu.print(dan);
        System.out.println();
//        gu.printAll();
        gu.print(); // 2~9단까지 출력



        System.out.println("시작단 입력 : ");
        int startDan = gu.getDan();

        System.out.println("종료단 입력 : ");
        int endDan = gu.getDan();

        gu.print(startDan, endDan);






    }
}
