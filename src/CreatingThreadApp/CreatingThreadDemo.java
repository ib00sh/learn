package CreatingThreadApp;

public class CreatingThreadDemo {
    public static void main(String[] args) {
        System.out.println("Начинается выполнение программы");
        Thread t = new Thread(new MyThread());
        System.out.println("Запускается дочерний поток");
        t.start();
        for (int k = 0; k <=5 ; k++) {
            System.out.println("Главный поток:\t" + (char)('A'+k));
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException ex){
                System.out.println("Прерываение главного потока");
            }
        }
        System.out.println("Выполнение программы завершено");
    }
}
