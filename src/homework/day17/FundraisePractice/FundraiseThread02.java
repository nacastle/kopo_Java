package homework.day17.FundraisePractice;

class FundraiseThread02 extends Thread {

    private FundraiseData fundraiseData;
    private int subTotal;

    public FundraiseThread02(FundraiseData fundraiseData) {
        this.fundraiseData = fundraiseData;
    }

    @Override
    public  void run() {

        for(int i = 0; i < 10; i++) {
            fundraiseData.secondCallCenter(i<9);
            subTotal += fundraiseData.getDonation();
//            while (i == 9) {
//                notifyAll();
//            }
        }
//        notifyAll();
        System.out.println("2번 콜센터 총 모금액: " + subTotal+"원");
    }
    public int getSubTotal() {
        return subTotal;
    }

}
