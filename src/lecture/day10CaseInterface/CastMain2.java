package lecture.day10CaseInterface;

import java.util.ArrayList;

public class CastMain2 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();   // ArrayList는 참조자료형만 들어가... 기본자료형은 못들어감 (따라서 10이 들어가더라도 int가 아닌 Integer)
        // add: 원래는 Object라는 부모 클래스가 잡혀있는데, 묵시적 형변환으로 다른 타입이 들어간 것
        list.add(10);
        list.add("man");
        list.add(new IceCream());
        // => 0번지: 숫자 타입 / 1번지: 문자열 타입 / 2번지: IceCream() 타입

        list.get(0); // => 리턴타입이 Object 클래스 형이다
        // 따라서...
//      int n = list.get(0); // 이렇게 대입 불가능
        int n = (int) list.get(0); // 이렇게 명시적 형변환을 해주면 가능

    }

}

class IceCream {

}
