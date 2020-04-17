
package lecture.day06;
/* 생성자 특징
1. 클래스명과 동일
2. 반환형이 존재하지 않음
3. 생성자 오버로딩 지원
4. 객체의 속성 초기화
5. 디폴트 생성자 지원: 클래스 내에 생성자가 하나도 정의돼있지 않은 경우 JVM이 자동으로 생성자 선언 (매개변수는 X, 내용부 X)
                    ex. 클래스명() {}
6.


*/
class Dog {

    Dog() {  // 생성자는 반환값이 없기 때문에 앞에 아무것도 안 붙인다 (void 라든지 int 라든지...)
        System.out.println("Dog() 디폴트 생성자 호출..."); // 습관적으로 기본 생성자 만들어주자 (안 만들어주면 에러 생길 수 있음)
    }

    Dog(String str) {
        System.out.println("Dog(String) 생성자 호출...");
    }
    Dog(String str, int a) {
        System.out.println("Dog(String, int) 생성자 호출...");
    }

}
public class ConstructorMain01 {
    public static void main(String[] args) {
        new Dog();
        new Dog("강쥐");
        new Dog("강아지", 5);
    }
}
