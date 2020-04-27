package lecture.day10CaseInterface;

public class Parent {

    private String name = "부모";

    public void print() {
        System.out.println("나는 " + name + " 객체입니다");
    }

    public void print2(Parent p) {
        p.print();
        if (p instanceof Child01) {
            Child01 child01 = (Child01) p;
            ((Child01) p).sleep();
            ((Child01) p).study();
        } else if (p instanceof Child02) {
            Child02 child02 = (Child02) p;
            ((Child02) p).play();
            ((Child02) p).sing();
        } else if (p instanceof Child03) {
            Child03 child03 = (Child03) p;
        }
    }

    // 인스턴스 객체를 만들어주는 메소드 작성방법 (뭔가 참신..)
    public static Parent getInstance() {
        return new Child01();
    }
}
