package list12_4;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Дочерний поток\t" + i);
            try{
                Thread.sleep(4500);
            }
            catch (InterruptedException ex){
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
