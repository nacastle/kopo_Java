package homework.day04;

public class Practice {
    public static void main(String[] args) {

        // 값 reverse 시키기
        int[] biggerArr = {123, 43,657, 8756, 23467}; // 321, 34 765 6578 76432 만들기
        for (int i = 0; i <= biggerArr.length-1; i++) {
            int reverseValue = 0;
            while (true) {
                reverseValue += biggerArr[i] % 10;
                biggerArr[i] /= 10;

                if (biggerArr[i] == 0) {
                    System.out.println(reverseValue);
                    break;
                } else {
                    reverseValue *= 10;
                }

            }

        }
    }
}
