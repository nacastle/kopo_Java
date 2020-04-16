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
public class MethodMain01 { //피호출자 메소드... 호출자 메소드의 변수와 피호출자 메소드의 변수는 기본적으로 독립적

    static void printStar() { // void: 피호출자와 호출자 메소드 사이에 전달할 값이 없을 때?
        System.out.println("**********"); //
        int i = 10; // 지역변수... 이 안에서만 돌고 없어져
        ++i;
    }

    public static void main(String[] args) { //호출자 메소드

        int i = 100;
        printStar(); //int i = 10;은 이 줄에서만 돌고 없어져
        System.out.println("Hello");
        printStar(); //int i = 10;은 이 줄에서만 돌고 없어져
        System.out.println("Hi");
        printStar(); //int i = 10;은 이 줄에서만 돌고 없어져
        System.out.println("Goodbye");
        printStar(); //int i = 10;은 이 줄에서만 돌고 없어져
        System.out.println(i);

    }
}
