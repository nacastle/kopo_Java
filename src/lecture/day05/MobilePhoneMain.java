package lecture.day05;

public class MobilePhoneMain {
    public static void main(String[] args) {

        MobilePhone mp = new MobilePhone();
        mp.name = "나성주";
        mp.number = "010-4211-3145";
        mp.company = "삼성";

        MobilePhone mp2 = new MobilePhone();
        mp2.name = "나형주";
        mp2.number = "010-6511-3145";
        mp2.company = "애플";

        MobilePhone mp3 = new MobilePhone();
        mp3.name = "나경주";
        mp3.number = "010-4431-3145";
        mp3.company = "엘지";


        System.out.println("사용자명: " + mp.name + "번호" + mp.number + "제조사" + mp.company);
        System.out.println("사용자명: " + mp2.name + "번호" + mp2.number + "제조사" + mp2.company);
        System.out.println("사용자명: " + mp3.name + "번호" + mp3.number + "제조사" + mp3.company);


        // 반복문으로 출력하기
        System.out.println("반복문으로 출력하기");
        MobilePhone[] mpArr;
        mpArr = new MobilePhone[]{mp, mp2, mp3};

//        MobilePhone[] mpArr = {mp, mp2, mp3}; // 이렇게 표현할수도 있다.


        for (int i = 0; i < mpArr.length; i++) {
            System.out.println("사용자명 : " + mpArr[i].name + "번호 : " + mpArr[i].number + "제조사 : " + mpArr[i].company);
        }
    }
}
