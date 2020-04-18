package homework.day06Class;

/*8. 사칙연산을 수행하는 Calculator 클래스 작성
        정수 : 12
        정수 : 5
        12 + 5 = 17
        12 - 5 = 7
        12 * 5 = 60
        12 / 5 = 2.4
        12 소수체크 : false
        5 소수체크 : true*/

import java.util.Scanner;

public class Calculator {

    int x1, x2;


    void numInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        this.x1 = sc.nextInt();
        System.out.print("정수 : ");
        this.x2 = sc.nextInt();
    }

    int addFunction() {

        int sum = 0;
        sum = this.x1 + this.x2;

        return sum;
    }

    int minusFunction() {

        int minus = 0;
        minus = this.x1 - this.x2;

        return minus;
    }

    int multiplyFunction() {

        int multiply = 0;
        multiply = this.x1 * this.x2;

        return multiply;
    }

    double divideFunction() {

        double divide = 0;
        divide = (double) this.x1 / this.x2;

        return divide;
    }

    void printResult() {
        System.out.printf("%d + %d = %d\n", this.x1, this.x2, addFunction());
        System.out.printf("%d - %d = %d\n", this.x1, this.x2, minusFunction());
        System.out.printf("%d * %d = %d\n", this.x1, this.x2, multiplyFunction());
        System.out.printf("%d / %d = %.1f\n", this.x1, this.x2, divideFunction());
        System.out.printf("%d 소수체크 : %b\n", this.x1, sosuJudge1());
        System.out.printf("%d 소수체크 : %b\n", this.x2, sosuJudge2());

    }

    boolean sosuJudge1() {

        int cnt = 0;
        for (int i = 1; i <= this.x1; i++) {
            if (this.x1 % i == 0) {
                cnt += 1;
            }
        }
        if (cnt == 2) {
            return true;
        }
        return false;
    }

    boolean sosuJudge2() {

        int cnt = 0;
        for (int i = 1; i <= this.x2; i++) {
            if (this.x2 % i == 0) {
                cnt += 1;
            }
        }
        if (cnt == 2) {
            return true;
        }
        return false;
    }




 /*       if ()

        if ()
            for (int i = 0; i <= sosuArr.length - 1; i++) {

                if (sosuArr[i] == x1) {
                    break;
                }
            }
        return true;

*/

}
