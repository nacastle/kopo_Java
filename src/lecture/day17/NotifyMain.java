package lecture.day17;

class ThreadIteration{
    public static int ITER_CNT = 10;
}


class Data {

    public synchronized void a(boolean waitFlag) {
        try {
            notify();
            System.out.println("a() 메소드 호출...");
            if (waitFlag) {
                wait();
            }

//            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void b(boolean waitFlag) {
        try {
            notify();
            System.out.println("b() 메소드 호출...");
            if (waitFlag) {
                wait();
            }
//            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class NotifyThread01 extends Thread {

    private Data data;

    public NotifyThread01(Data data) {
        this.data = data;
    }

    @Override
    public  void run() {
        final int ITER_CNT = ThreadIteration.ITER_CNT;
        for (int i = 0; i < ITER_CNT; i++) {

            data.a(i < ITER_CNT-1);

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


class NotifyThread02 extends Thread {

    private Data data;

    public NotifyThread02(Data data) {
        this.data = data;
    }

    @Override
    public  void run() {
        final int ITER_CNT = ThreadIteration.ITER_CNT;
        for (int i = 0; i < ITER_CNT; i++) {
            data.b(i<ITER_CNT-1);
        }

    }
}


public class NotifyMain {

    public static void main(String[] args) throws InterruptedException {

        Data data = new Data();

        NotifyThread01 nt01 = new NotifyThread01(data);
        NotifyThread02 nt02 = new NotifyThread02(data);
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









