package homework.day17.Fundraise;

class FundraiseThreadPrac extends Thread {

    private CallCenter callCenter;
    private int centerNo = 0;
    private int total;
    private boolean isConsecutive = false;
    private int pastThread = -1;

    public FundraiseThreadPrac(int centerNo, CallCenter callCenter) {
        this.callCenter = callCenter;
        this.centerNo = centerNo;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            synchronized (this) {
//                if (pastThread == centerNo) {
//                    isConsecutive = true;
//                }
//            int currentThread = -1;
                callCenter.gotCall(centerNo, i < 9 && (pastThread != centerNo));
                callCenter.gotCall(centerNo, i < 9 && (pastThread != centerNo));
                pastThread = centerNo;
            }
//                    Thread.currentThread();
//                    System.out.println(++isConsecutive);
        }
    }
//            System.out.println(centerNo + "번 콜센터 총 모금액: " + callCenter.getSubtotal() + "원");
//            total += callCenter.getSubtotal();


    public int getTotal() {
        return total;
    }
}

