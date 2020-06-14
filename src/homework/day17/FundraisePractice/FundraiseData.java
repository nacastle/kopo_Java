package homework.day17.FundraisePractice;

import java.util.Random;

class FundraiseData {
    private int donation = 0;
    Random r = new Random();

    public synchronized void firstCallCenter(boolean waitFlag) {
        try {
            notify();
            donation = (r.nextInt(10)+1)*1000;
            System.out.println("1번 콜센터 : "+donation+"원을 받았습니다.");
            if (waitFlag) {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void secondCallCenter(boolean waitFlag) {
        try {
            notify();
            donation = (r.nextInt(10)+1)*1000;
            System.out.println("2번 콜센터 : "+donation+"원을 받았습니다.");
            if (waitFlag) {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void thirdCallCenter(boolean waitFlag) {
        try {
            notify();
            donation = (r.nextInt(10)+1)*1000;
            System.out.println("3번 콜센터 : "+donation+"원을 받았습니다.");
            if (waitFlag) {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void fourthCallCenter(boolean waitFlag) {
        try {
            notify();
            donation = (r.nextInt(10)+1)*1000;
            System.out.println("4번 콜센터 : "+donation+"원을 받았습니다.");
            if (waitFlag) {
                wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getDonation() {
        return this.donation;
    }


}
