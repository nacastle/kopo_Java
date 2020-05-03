package homework.day12.Lotto.ListContainsSearch;

public class Prize {

    private int[] prize;


    public void showPrize(int winCnt, boolean isBonusWin) {

        prize = new int[]{5_000, 50_000, 14_000_000, 50_000_000, 2000_000_000};

        if (winCnt > 0) {
            System.out.printf("총 %d개의 번호가 일치합니다. ", winCnt);
            if (winCnt == 1 || winCnt == 2) {
                System.out.println("상금은 없습니다.");
            }
            for (int i = 0; i < prize.length; i++) {
                if (winCnt == i + 3) {
                    System.out.printf("축하합니다! 상금 %d원을 수령해 가세요.\n", prize[i]);
                }
            }
        } else {
            System.out.println("일치하는 번호가 없습니다.");
        }
    }
}
