package homework.day06Class.Practice;

import java.util.Scanner;

public class ClassMethodMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c = ClassMethod.add(1,2); // 클래스 메소드는 이렇게 객체 생성 없이 메소드를 소환하여 사용할 수 있다.
        System.out.println(c);

        ClassMethod cl = new ClassMethod();
        int d = cl.minus(1,2); // 인스턴스 메소드는 객체를 생성해준 이후에야 메소드 사용이 가능하다.
        System.out.println(d);

        int e = cl.addMulti(3,4); // 클래스 메소드를 포함한 인스턴스 메소드 소환
        System.out.println(e);


// 연구 더 필요,,,
        ClassMethod[] clsArr = ClassMethod.makeObject(3);

        for (int i = 0; i < clsArr.length; i++) {
            clsArr[i].price = sc.nextInt();
            sc.nextLine();
            clsArr[i].name = sc.nextLine();
            sc.nextLine();
        }
        for (int i = 0; i < clsArr.length; i++) {
            System.out.println("가격" + clsArr[i].price + ", " + "제품명" + clsArr[i].name);
        }

    }
}
