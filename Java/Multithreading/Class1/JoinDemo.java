class JoinThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("child Thread");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t1 = new JoinThread();
        t1.start();
        t1.join(); // main - jo line execute karege wahi wait karegi

        for (int i = 0; i < 6; i++) {
            System.out.println("main thread");
        }
    }
}
