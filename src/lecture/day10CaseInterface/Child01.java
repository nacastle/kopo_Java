package lecture.day10CaseInterface;

public class Child01 extends Parent {

    private String name = "자식1";

    @Override
    public void print() {
        System.out.println("나는 " + name + " 객체입니다");
    }

    public void study() {
        System.out.println("나는 공부를 합니다");

    }

    public void sleep() {
        System.out.println("나는 잠을 잡니다");
    }


}
