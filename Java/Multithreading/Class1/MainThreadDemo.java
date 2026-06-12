public class MainThreadDemo {
    public static void main(String[] args) {
        System.out.println("Thread Details " + Thread.currentThread());
        System.out.println("Thread Name " + Thread.currentThread().getName());
        System.out.println("Thread PriorityNumber " + Thread.currentThread().getPriority());
    }
}
