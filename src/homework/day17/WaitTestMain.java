package homework.day17;


class WaitThread extends Thread {


    @Override
    public void run() {
        System.out.println("wait 스레드 호출...");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class WaitThread2 extends Thread {


    @Override
    public void run() {
        System.out.println("wait 스레드2 호출...");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


//class NotifyThread022 extends Thread {
//
//    private Data3 data3;
//
//    public NotifyThread022(Data3 data3) {
//        this.data3 = data3;
//    }
//
//    @Override
//    public  void run() {
//        final int ITER_CNT = ThreadIteration.ITER_CNT;
//        for (int i = 0; i < ITER_CNT; i++) {
//            data3.b(i<ITER_CNT-1);
//        }
//
//    }
//}


public class WaitTestMain {

    public static void main(String[] args) throws InterruptedException {


        WaitThread wt = new WaitThread();
        WaitThread2 wt2 = new WaitThread2();
        wt.start();
        wt2.start();

//        wt.join();


        System.out.println("종료...");


        //            ExitThread et = new ExitThread();

//        Thread.yield();
//        et.wait();

//        nt01.setPriority(Thread.MAX_PRIORITY);
//        nt02.setPriority(Thread.MAX_PRIORITY);
//            et.setPriority(Thread.MIN_PRIORITY);


//        et.start();

//        nt01.notifyAll();


//        nt01.stop();
//        nt02.stop();


//
//        System.exit(0);
    }

}


//class ExitThread extends Thread {
//
//
//    @Override
//    public void run() {
//        System.out.println("종료...");
//
//
//    }
//}









