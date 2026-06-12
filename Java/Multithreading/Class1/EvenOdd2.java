class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 9; i = i + 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOdd2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new EvenThread());
        Thread t2 = new Thread(new OddThread());
        t1.start();
        t2.start();
    }
}
