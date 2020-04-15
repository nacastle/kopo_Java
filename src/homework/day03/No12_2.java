package homework.day03;

/*
12.
다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
        *-------*
        **-----**
        ***---***
        ****-****
        *********
        ****-****
        ***---***
        **-----**
        *-------*
*/

public class No12_2 {

    public static void main(String[] args) {

        int star = 1;
        for (int row = 1; row <= 9; row++) {
//            if (row < 5) {
            for (int column = 1; column <= 9; column++) {
                if (column <= star || column >= 10 - star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (row < 5) {
                star += 1;
            } else {
                star -= 1;
            }


/*
            } else {
                for (int column = 1; column <= 9; column++) {
                    if (column <= star || column >= 10 - star) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                star -= 1;

            }
            System.out.println();
        }


    }

*/
        }
    }
}
