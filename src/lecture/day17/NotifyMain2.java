package lecture.day17;

class Data2 {

    public synchronized void a() {
        try {
            notify();
            System.out.println("a() 메소드 호출...");
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void b() {
        try {

            notify();
            System.out.println("b() 메소드 호출...");
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class NotifyThread201 extends Thread {

    private Data2 data;

    public NotifyThread201(Data2 data) {
        this.data = data;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            data.a();
        }
    }
}

class NotifyThread202 extends Thread {

    private Data2 data;

    public NotifyThread202(Data2 data) {
        this.data = data;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            data.b();
        }
    }
}

class CloseThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("끝입니다");
        System.exit(0);
    }
}

class Execute {
    public static void execute() {
        Data2 data = new Data2();

        NotifyThread201 nt01 = new NotifyThread201(data);
        NotifyThread202 nt02 = new NotifyThread202(data);
        CloseThread2 ct2 = new CloseThread2();

        nt01.start();
        nt02.start();
        ct2.start();

        nt01.setPriority(Thread.MAX_PRIORITY);
        nt02.setPriority(Thread.MAX_PRIORITY);
        ct2.setPriority(Thread.MIN_PRIORITY);

    }
}

public class NotifyMain2 {

    public static void main(String[] args) {

        Execute.execute();

//        Data2 data = new Data2();
//
//        NotifyThread201 nt01 = new NotifyThread201(data);
//        NotifyThread202 nt02 = new NotifyThread202(data);
//        CloseThread2 ct2 = new CloseThread2();
//
//        nt01.start();
//        nt02.start();
//        ct2.start();
//
//        nt01.setPriority(Thread.MAX_PRIORITY);
//        nt02.setPriority(Thread.MAX_PRIORITY);
//        ct2.setPriority(Thread.MIN_PRIORITY);

//        try {
//            nt01.join();
//            nt02.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("끝입니다");
//        System.exit(0);
    }
}



