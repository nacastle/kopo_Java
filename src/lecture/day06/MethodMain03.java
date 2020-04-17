package lecture.day06;

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
