package homework.day06Class.Practice;

public class Field {

    int a, b; // 필드 (=전역변수, 멤버변수)

    // cf) 지역변수 = {}안에서만 돌다가 없어지는 변수

    int minus() {
        return this.a-this.b; // 혹은 a-b로 표현 가능
        // 파라미터(매개변수)가 없으면 전역변수로 활용가능...
        // 메인 메소드에서 객체 만들어 준 후 멤버변수 값 선언해주고 사용해주면 됨 됨
    }

    static int add(int a, int b) {
        return a+b;
//        return this.a+this.b; // 클래스 메소드에서는 멤버변수가 사용 불가능한가..?
    }

}
