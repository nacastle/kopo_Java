package lecture.day08;

class PracticeMain {
    public static void main(String[] args) {

        Practice p = new Practice(1,"s");

        p.i = 2;    // 수정된다.

        System.out.println(p.i + p.str);

    }
}
