package lecture.day10CaseInterface;

public class CastMain {


    public static void main(String[] args) {

        Parent p = Parent.getInstance();  // 메소드로 인스턴스 객체 만들기
        p.print();
        System.out.println();
        p.print2(p);

/*
        Parent p = new Child02();   // 객체의 묵시적 형변환: 부모객체 --> 자식객체 (부모객체의 메소드만 사용 가능, 자식객체 메소드 사용 불가능)
        p.print();  // 자식객체의 메소드 구동
        System.out.println();
        p.print2(p);    // instanceof 키워드를 활용한 자식객체로 형변환된 부모객체를 다시 자식객체로 형변환 하기...(이러면 자식객체의 메소드 전부 사용 가능)
*/


/*
        System.out.println();
        Child01 c01 = (Child01) p; // 명시적 형변환: 자식객체로 형변환된 부모객체를 다시 자식객체로 형변환 하기.
        // 명시적 형변환 하니 자식객체의 메소드 다시 사용가능해짐
        c01.print();
        c01.study();
        c01.sleep();
*/





        /*
        Child02 c02 = new Child02();
        c02.print();
        c02.sing();
        c02.play();

        Child01 c01 = new Child01();
        c01.print();
        c01.sleep();
        c01.study();

        Parent p = new Parent();
        p.print();
        */
    }
}
