package list12_5;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread t;
        t = Thread.currentThread();
        System.out.println(t);
        t.setName("Главный поток");
        t.setPriority(7);
        System.out.println(t);
    }
}
