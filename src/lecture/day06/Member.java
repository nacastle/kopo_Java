package lecture.day06;

public class Member {

    String name; // 이름
    int age; // 나이
    String bloodType;  // 혈액형

    //한 덩어리 케이스 더 있음... 교수님꺼 복사해오기


    Member() { // 위 선언대로 놔두면 null, 0, null 값이 찍히기에 생성자를 임의로 새로 정의
        this("알수없음",-1,"알수없음");
    }
    Member(String name) {
        this(name, -1, "알수없음");
    }
    Member(String name, int age) {
        this(name, age, "알수없음"); // Member((name, age, "알수없음"); 써주면 에러뜸... 이럴 때 this 로
    }

    Member(String name, int age, String bloodType) {  // 이럴때는 this 가 필요
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
    }


/*
    Member() { // 위 선언대로 놔두면 null, 0, null 값이 찍히기에 생성자를 임의로 새로 정의
        name = "알수없음";
        age = -1;
        bloodType = "알수없음";
    }
    Member(String str) {
        name = str;
        age = -1;
        bloodType = "알수없음";
    }
    Member(String str, int n) {
        name = str;
        age = n;
        bloodType = "알수없음";
    }
    Member(String name, int age, String bloodType) {  // 이럴때는 this 가 필요
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
    }
*/


    void info() {
        System.out.println("이름:" + name + ", 나이:" + (age==-1 ? "알수없음" : age) + ", 혈액형:" + bloodType);
    }
}
