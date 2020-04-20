package homework.day06Class.Practice;

public class ClassMethod {

    int price = 0;
    String name = "";

//    int a, b; // 매개변수를 선언해줬기에 멤버변수는 굳이 필요 없었음.

    static int add(int a, int b) {  // 클래스 메소드 (멤버변수 사용이 불가하던데..?)
        return a+b;
    }

    int minus(int a, int b) {   // 인스턴스 메소드
        return a-b;
    }

    int addMulti (int a, int b) { // 인스턴스 메소드 안에서도 클래스 메소드를 호출할 수 있다.
        return add(a, b) + a*b;
    }

// 연구 더 필요,,,
    static ClassMethod[] makeObject (int n) {

        ClassMethod[] clsArr = new ClassMethod[n];
        for (int i = 0; i < n; i++) {
            clsArr[i] = new ClassMethod();
        }
        return clsArr;
    }
}
