package list12_2;

public class NewThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начинается выполненние программы");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Дочерний поток\t" + i);
                try {
                    Thread.sleep(4500);
                }
                catch (InterruptedException ex){
                    System.out.println("Прерываение дочернего потока");
                }
                }
            }
        });
        System.out.println("Запускатеся дочерний поток");
        t.start();
        for (int k = 0; k <= 5; k++) {
            System.out.println("Главный поток\t" + (char)('A' + k));
            Thread.sleep(2000);
        }
        if(t.isAlive()){
            t.join();
        }
        System.out.println("Выполнение программмы завершено");

    }
}
