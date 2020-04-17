package lecture.day06;

class Method {
    /* 메소드는 오버로딩(Overloading)을 지원한다
오버로딩: 클래스 내에 동일한 메소드명을 가지면서 매개변수의 타입이나 개수가 다른 것

*/
    void call() {
        System.out.println("call() 메소드 호출...");
    }

    void call(int i) { // 매개변수 int i
        System.out.println("call(int) 메소드 호출...");
    }

    void call(String str) { // 매개변수 String str
        System.out.println("call(String) 메소드 호출...");
    }

    void call(String str, int i) { // 매개변수 String str, int i
        System.out.println("call(String, int) 메소드 호출...");
    }

    void call(char ch) { // 매개변수 char ch
        System.out.println("call(char) 메소드 호출...");
    }
}

public class MethodMain03 {
    public static void main(String[] args) {
        Method m = new Method(); //인스턴트 객체 생성
        m.call();
        m.call(1);
        m.call("abc");
        m.call("Hi", 1);
        m.call('a'); // char < int < long< float < double

    }


}
