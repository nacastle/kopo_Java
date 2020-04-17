package lecture.day05;
/*
    **********
    Hello
    **********
    Hi
    **********
    Goodbye
    **********
*/

/* 반환형 메소드(매개변수) {
    }
- 매개변수: 호출자 메소드가 피호출자 메소드에게 값을 전달하는 것
- 반환형: 피호출자 메소드가 호출자 메소드에게 값을 전달하기 위한 것

*/
public class MethodMain02 { //피호출자 메소드... 호출자 메소드의 변수와 피호출자 메소드의 변수는 기본적으로 독립적

    static void printStar(char a, int cnt) { // void: 피호출자와 호출자 메소드 사이에 전달할 값이 없을 때?

        for (int i = 0; i < cnt; i++) { // cnt, a = 매개변수
            System.out.print(a);
        }
        System.out.println();
        return; // 빈 몸으로 반환할 때 (void)
    }

    static int factorial(int n) { // 리턴값이 있는 경우...void가 아닌 return의 자료형을 담아야 (int)
        int result = 1; // 곱셈이니까 0으로 선언하면 안됨
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result; //피호출자가 호출자에게 전달할 값
    }

    public static void main(String[] args) { //호출자 메소드


        int r = factorial(3);
        System.out.println("3! ==> " + r);

        printStar('!',10);
        System.out.println("Hello");
        printStar('@',5);
        System.out.println("Hi");
        printStar('#',20);
        System.out.println("Goodbye");
        printStar('$',30);

    }


}
