package homework.day03;
/*
9. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 9단은 나오면 안됩니다.
        반복문은 최대 3개만 사용합니다.
        2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
        2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
        ...
        5 * 1 = 5 6 7
        ...
        8 9

        for(int dan = 2; dan <= 9; ) {
        }
*/

public class No09 {

    public static void main(String[] args) {

        // 각 열의 시작에 있어서 1열은 2단 -> 5단 -> 8단, 2열은 3 -> 6 -> 9, 3열은 4 -> 7 이라는 등차수열 규칙이 있다는 것을 이용했습니다.

        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <=9; i++) {
                System.out.printf("%d * %d = %d\t", (3*j-1), i, (3*j-1)*i); // 1열의 등차수열 공식: 3n-1 단
                System.out.printf("%d * %d = %d\t", (3*j), i, 3*j*i); // 2열의 등차수열 공식: 3n 단
                if ((3*j+1) != 10) { // 10단까지 나열하지 않기 위한 장치
                    System.out.printf("%d * %d = %d\t", (3*j+1), i, (3*j+1)*i); // 3열의 등차수열 공식: 3n+1 단
                }
                System.out.printf("\n");
            }

            System.out.printf("\n");
        }
    }
}

//To 이지유 교수님: 뭔가 어거지로 코드를 짠 느낌이 있는데 좀 더 효율적이거나 깔끔한 방법이 있으면 알려주시면 감사하겠습니다!