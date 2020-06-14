package homework.day17.FundraisePractice;

class FundraiseThread04 extends Thread {

    private FundraiseData fundraiseData;
    private int subTotal;

    public FundraiseThread04(FundraiseData fundraiseData) {
        this.fundraiseData = fundraiseData;
    }

    @Override
    public  void run() {

        for(int i = 0; i < 10; i++) {
            fundraiseData.fourthCallCenter(i<9);
            subTotal += fundraiseData.getDonation();
//            if (i == 9) {
//                notifyAll();
//
//            }
        }
        System.out.println("4번 콜센터 총 모금액: " + subTotal +"원");
    }
    public int getSubTotal() {
        return subTotal;
    }

}
