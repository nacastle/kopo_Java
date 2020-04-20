package homework.day06Class.Practice;

public class FieldMain {
    public static void main(String[] args) {

        Field fd = new Field(); // 객체 생성

        fd.a = 3;   // 멤버변수 값 선언
        fd.b = 4;   // 멤버변수 값 선언

        int c = fd.minus(); // 파라미터 없이 메소드 사용
        System.out.println(c);
    }
}
