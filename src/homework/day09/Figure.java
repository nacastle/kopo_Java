package homework.day09;

// 뭔가 꾸역꾸역 결과값이 잘 나오게끔 만들긴했는데,
// 아직 한참은 부족한 것 같습니다... 되게 엉성하게 코딩한데다가, 왜 필요한지도 모르고 만든 메소드와 생성자들이 좀 있습니다..
// 주말동안 상속, 생성자, abstract에 대한 개념정리를 제대로 한 뒤에 한번 더 정리해보려합니다...

public abstract class Figure {

    protected double area; // protected: 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능


    public Figure() {
    }

    public Figure(double area) {
        super();
        this.area = area;
    }

    public abstract double makeArea();  // 이 클래스를 상속받는 어느 클래스든 면적을 구하는 메소드를 오버라이딩 하게끔 명시
}
