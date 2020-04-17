package lecture.day06;

import java.util.Random;
import java.util.Scanner;

public class ExamMethod {

    int getSum(int a, int b) {

        return a+b;
    }

    int getTotalSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 1~100사이의 난수 10개 추출하여 호출자에게 전달하는 기능
     *
     */

    int[] getNums() {

        int[] nums = getNums(10);

       /* int[] nums = new int[10];
        Random r = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1;
        }*/

        return nums;

    }

    int[] getNums(int a) {

        int[] nums = new int[a];
        Random r = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1;
        }
        return nums;
    }

    int[] getNums(int max, int size) { // 이걸 기존 메소드를 활용해서 쓸순 없을까?

            Random r = new Random();
            int[] nums = new int[size];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = r.nextInt(max)+1;
            }
            return nums;
    }


    int getNum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        return a;
    }

}
