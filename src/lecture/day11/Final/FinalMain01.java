package lecture.day11.Final;

import java.util.Random;

class MyRandom extends Random {

    /*
    nextInt(10)했을때
    0~9의 난수가 아닌
    1~10의 난수가 넘어가게끔 하기

    */
    @Override
    public int nextInt(int bound) {
        int r = super.nextInt(bound) + 1;
        return r;
    }
}

public class FinalMain01 {
    public static void main(String[] args) {

        MyRandom r = new MyRandom();
        int a = r.nextInt(2); // 1~2에서 난수

        System.out.println(a);

    }
}
