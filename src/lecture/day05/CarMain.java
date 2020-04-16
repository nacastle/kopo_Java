package lecture.day05;

public class CarMain {
    public static void main(String[] args) { // 자동차를 만드는 클래스... 실제 실행하는 클래스...JVM이 실행함

        Car c = new Car(); // heap 영역에 자동차 한 대가 만들어짐... 참조자료형 c 생성 // 101호의 자동차
//        int num; // 지역변수: 메인 메소드 안에 만들어진 변수 ( {}를 지나면 끝나는 변수 )
        c.name = "소나타";
        c.price = 333;

        System.out.println("c:" + c); //@7291c18f c의 주소값
        System.out.println("자동차명:" + c.name + "\n" + "가격 : " + c.price + "만 원");

        Car c2 = new Car(); // 102호의 자동차

        c2.name = "모닝";
        c2.price = 222;

        System.out.println("자동차명 :" + c2.name + "\n" + "가격 : " + c2.price + "만 원");

    }
}
