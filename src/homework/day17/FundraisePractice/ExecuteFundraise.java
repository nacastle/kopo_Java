//package homework.day17.Fundraise;
//
//public class ExecuteFundraise {
//
//    public void execute() throws InterruptedException {
//        FundraiseData fd = new FundraiseData();
//        FundraiseThread ft1 = new FundraiseThread(fd);
//        FundraiseThread02 ft2 = new FundraiseThread02(fd);
//        FundraiseThread03 ft3 = new FundraiseThread03(fd);
//        FundraiseThread04 ft4 = new FundraiseThread04(fd);
//        CloseFundraiseThread cft = new CloseFundraiseThread();
//
//
////        ft1.setPriority(Thread.MAX_PRIORITY);
////        ft2.setPriority(Thread.MAX_PRIORITY);
////        ft3.setPriority(Thread.MAX_PRIORITY);
////        ft4.setPriority(Thread.MAX_PRIORITY);
////        cft.setPriority(Thread.MIN_PRIORITY);
//
//
//        ft1.start();
//        ft2.start();
//        ft3.start();
//        ft4.start();
//
//        ft1.join();
//        ft2.join();
//        ft3.join();
//        ft4.join();
////        cft.start();
//    }
//}
