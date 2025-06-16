class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread child class");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
