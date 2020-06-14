package homework.day17;

class ThreadIteration{
    public static int ITER_CNT = 10;
}


class Data3 {

    public synchronized void a(int no, boolean waitFlag) {
        try {
            notify();
            System.out.println(no + "() 메소드 호출...");
            if (waitFlag) {
                wait();
            }

//            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public synchronized void b(inboolean waitFlag) {
//        try {
//            notify();
//            System.out.println("b() 메소드 호출...");
//            if (waitFlag) {
//                wait();
//            }
////            notifyAll();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

class NotifyThread021 extends Thread {

    private Data3 data3;
    private int no;

    public NotifyThread021(Data3 data3, int no) {
        this.data3 = data3;
        this.no = no;
    }

    @Override
    public  void run() {
        final int ITER_CNT = ThreadIteration.ITER_CNT;
        for (int i = 0; i < ITER_CNT; i++) {

            data3.a(no,i < ITER_CNT-1);

//            synchronized (this) {
//                notify();
//                System.out.println("a() 메소드 호출...");
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }


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


public class Integrated_NotifyMain {

    public static void main(String[] args) throws InterruptedException {

        Data3 data3 = new Data3();

        NotifyThread021 nt01 = new NotifyThread021(data3,1);
        NotifyThread021 nt02 = new NotifyThread021(data3,2);
        nt01.start();
        nt02.start();

        nt01.join();
        nt02.join();

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









