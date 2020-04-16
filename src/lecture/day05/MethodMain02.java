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
    }

    public static void main(String[] args) { //호출자 메소드

        printStar('!',10);
        System.out.println("Hello");
        printStar('@',5);
        System.out.println("Hi");
        printStar('#',20);
        System.out.println("Goodbye");
        printStar('$',30);

    }


}
