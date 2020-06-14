package homework.day17.GroupAccount;

public class TransactionThread extends Thread{
    // 입금 스레드와 출금 스레드를 합친 스레드 클래스

    private AccountUser accountUser;
    public TransactionThread(AccountUser accountUser) {
        this.accountUser = accountUser;
    }

    Transaction tr = new Transaction();

    @Override
    public void run() {

        for (int i = 0; i < ThreadIteration.ITERATION_CNT; i++) {

            if (i % 2 == 0) {
                tr.withdraw(accountUser.getName(), accountUser.getGroupAccount());
            } else {
//                tr.deposit(accountUser.getName(),accountUser.getGroupAccount());
            }


        }
    }

}
