package homework.day06Class;

/*
    9. 어제 과제 아이스크림구하는 코드에 메소드를 추가해서 작성해보세요.
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
*/


import java.util.Scanner;

public class IceCream {

//    IceCream[] iceArr; // 언제쓰이지?
    String name;
    int price;
    int n;






    void howManyInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이스크림 몇 개 구입할래? : ");
        this.n = sc.nextInt();
    }


    void infoInput(IceCream[] iceArr) {

        for (int i = 0; i < this.n; i++) {
            iceArr[i] = new IceCream();
            this.titleInput(i);
            this.nameInput();
            iceArr[i].name = this.name;
            this.priceInput();
            iceArr[i].price = this.price;
        }
    }


    void titleInput(int i) {
        System.out.printf("*** %d번째 아이스크림 구매정보 ***\n",i+1);
    }

    void nameInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이스크림명 : ");
        this.name = sc.nextLine();
//        sc.nextLine();
    }

    void priceInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이스크림가격 : ");
        this.price = sc.nextInt();
//        sc.nextLine();
    }


    void titleOutput(int n) {
        System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", n);
        System.out.printf("%-5s %-15s %-15s", "번호", "아이스크림명", "아이스크림가격");
    }

    void infoOutput(IceCream[] iceArr) {

        for (int i = 1; i <= this.n; i++) {
            System.out.printf("%-5d %-15s %-15d\n", i, iceArr[i-1].name, iceArr[i-1].price );
        }
    }

}
